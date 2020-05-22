package cc.thread.java;

public class TestThreadJoin {
    public static void main(String[] args) {
        Thread father = new Thread(new FatherThread());
        father.start();
    }
}

class FatherThread implements Runnable{

    @Override
    public void run() {
        System.out.println("father want to smoke,but no smoke");
        System.out.println("son go to buy smoke");
        Thread son = new Thread(new SonThread());
        son.start();
        System.out.println("fatner waiting for son");
        try {
            son.join();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Where is the Son");
            System.exit(1);
        }
        System.out.println("Father Smoking");
    }
}

class SonThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Son go to buy smoke");
        System.out.println("Son need ten minutes");
        try{
            for (int i= 0; i <= 10; i++){
                System.out.println("No:" + i + "minute");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Son is back");
    }
}
