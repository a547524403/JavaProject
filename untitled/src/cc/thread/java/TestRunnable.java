package cc.thread.java;

public abstract class TestRunnable implements Runnable {
    public void run(){
        for (int i = 0; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new TestRunnable() {
            @Override
            public void run() {
                super.run();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new TestRunnable() {
            @Override
            public void run() {
                super.run();
            }
        });
        thread2.start();
    }
}
