package cc.thread.java;

public class TestSyncSs {
    public static void main(String[] args) {
        Account account1 = new Account(100,"Zhang");

        Drawing drawing1 = new Drawing(80,account1);
        Drawing drawing2 = new Drawing(80,account1);

        drawing1.start();
        drawing2.start();
    }
}

class AccountSs{
    int money;
    String aname;

    public AccountSs(int money,String aname){
        super();
        this.money = money;
        this.aname = aname;
    }
}

class Drawings extends Thread {
    int drawingsNum;
    AccountSs accountss;
    int expenseTotal;

    public Drawings(int drawingsNum, AccountSs accountss) {
        super();
        this.drawingsNum = drawingsNum;
        this.accountss = accountss;
    }

    @Override
    public void run() {
        draw();
        }

        void draw() {
        synchronized (accountss) {
            if (accountss.money - drawingsNum < 0) {
                System.out.println(this.getName() + " No Enough Money");
                return;
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountss.money -= drawingsNum;
            expenseTotal += drawingsNum;
        }
        System.out.println(this.getName() + " AccountMoney " + accountss.money);
        System.out.println(this.getName() + " ExpenseTotal " + expenseTotal);
    }
}