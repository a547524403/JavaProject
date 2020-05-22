package cc.thread.java;

public class TestDeadLocks {
    public static void main(String[] args) {
        MakeUps makeUps1 = new MakeUps();
        makeUps1.girl = "big one";
        makeUps1.flag = 0;

        MakeUps makeUps2 = new MakeUps();
        makeUps2.girl = "small one";
        makeUps2.flag = 1;

        makeUps1.start();
        makeUps2.start();

    }
}

class Lipsticks{
}

class Mirrors{
}

class MakeUps extends Thread{
    int flag;
    String girl;
    static Lipsticks lipsticks = new Lipsticks();
    static Mirrors mirrors = new Mirrors();

    @Override
    public void run() {
        doMakeUps();
    }

    void doMakeUps(){
        if (flag == 0){
            synchronized (lipsticks){
                System.out.println( girl + " take the lipstick " );
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (mirrors){
                System.out.println( girl + " take the mirroe " );
            }
        }else {
            synchronized (mirrors){
                System.out.println( girl + " take the mirroe " );
            }try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (lipsticks){
            System.out.println( girl + " take the lipstick " );
        }
    }
}