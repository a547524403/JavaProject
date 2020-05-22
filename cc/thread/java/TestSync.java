package cc.thread.java;

public class TestSync {
    public static void main(String[] args) {
        Account account = new Account(100,"Zhang");

        Drawing drawing1 = new Drawing(80,account);
        Drawing drawing2 = new Drawing(80,account);

        drawing1.start();
        drawing2.start();
    }
}

class Account{
    int money;
    String aname;

    public Account(int money,String aname){
        super();
        this.money = money;
        this.aname = aname;
    }
}

class Drawing extends Thread{
    int drawingNum;
    Account account;
    int expenseTotal;

    public  Drawing(int drawingNum,Account account){
        super();
        this.drawingNum = drawingNum;
        this.account = account;
    }

    @Override
    public void run() {
        if (account.money - drawingNum < 0){
            return;
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.money -= drawingNum;
        expenseTotal += drawingNum;

        System.out.println(this.getName() + " AccountMoney " + account.money);
        System.out.println(this.getName() + " ExpenseTotal " + expenseTotal);
    }
}