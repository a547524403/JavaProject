package cc.thread.java;

public class TestDeadLock {
    public static void main(String[] args) {
        MakeUp m1 = new MakeUp();
        m1.girl = " big one";
        m1.flag = 0;

        MakeUp m2 = new MakeUp();
        m2.girl = "small one";
        m2.flag = 1;

        m1.start();
        m2.start();
    }
}

class Lipstick{
}

class Mirror{
}
class MakeUp extends Thread{
     int flag;
     String girl;
     static Lipstick lipstick = new Lipstick();
     static Mirror mirror = new Mirror();

    @Override
    public void run() {
        doMakeUp();
    }

    void doMakeUp(){
        if (flag == 0){
            synchronized (lipstick){
                System.out.println( girl + " take the lipstick " );
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (mirror){
                    System.out.println( girl + " take the mirroe " );
                }
            }
        }else{
            synchronized (mirror){
                System.out.println( girl + " take the mirroe " );
            }try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lipstick){
                System.out.println( girl + " take the lipstick " );
            }
        }
    }
}