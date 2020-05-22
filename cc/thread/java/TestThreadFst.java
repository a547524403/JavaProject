package cc.thread.java;

public class TestThreadFst {
    public static void main(String[] args) throws Exception{
        Runnable runnable = new MyThread();
        Thread thread = new Thread(runnable,"Name Test");
        thread.start();
        System.out.println("name is" + thread.getName());
        Thread.currentThread().sleep(5000);
        System.out.println(thread.isAlive());
        System.out.println("over!");
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
