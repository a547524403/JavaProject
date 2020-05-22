package cc.thread.java;

public abstract class TestThreadCiyde implements Runnable {
    String name;
    boolean live = true;

    public TestThreadCiyde(String name){
        super();
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;

        while(live){
            System.out.println(name + (i++));
        }
    }

    public void terminate(){
        live = false;
    }

    public static void main(String[] args) {
        TestThreadCiyde ttc = new TestThreadCiyde("thread.A") {
            @Override
            public void run() {
                super.run();
            }
        };

        Thread t1 = new Thread(ttc);
        t1.start();

        for (int i = 0; i < 100 ; i++){
            System.out.println("Thread" + i);
        }

        ttc.terminate();
        System.out.println("ttc stop");
    }
}
