package cc.thread.java;

public class TestThreadSed {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadSed(),"thread1");
        Thread thread2 = new Thread(new MyThreadSed(),"thread2");

        thread1.setPriority(1);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();
    }
}

class MyThreadSed extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
