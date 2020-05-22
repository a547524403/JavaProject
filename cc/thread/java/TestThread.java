package cc.thread.java;

public class TestThread extends Thread{

    public void run(){
    for (int i = 0; i < 10; i++){
        System.out.println(this.getName() + " : " + i);
    }
    }

    public static void main(String[] args) {
        TestThread thread1 = new TestThread();
        thread1.start();
        TestThread thread2 = new TestThread();
        thread2.start();
    }
}
