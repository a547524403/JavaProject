package cc.thread.java;

public class TestProduce {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        Shengchan shengchan = new Shengchan(syncStack);
        Xiaofei xiaofei = new Xiaofei(syncStack);

        shengchan.start();
        xiaofei.start();
    }
}

class Mantou{
    int id;

    Mantou(int id){
        this.id = id;
    }
}

class SyncStack{
    int index = 0;
    Mantou[ ] mantous = new Mantou[10];
    public synchronized void push(Mantou mantou){
        while( index == mantous.length){
            try{
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        mantous[index] = mantou;
        index++;
    }

    public synchronized  Mantou pop(){
        while ( index == 0){
            try{
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return mantous[index];
    }
}

class Shengchan extends Thread{
    SyncStack syncStack = null;

    public Shengchan(SyncStack syncStack){
        this.syncStack = syncStack;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++){
            System.out.println( " make mantou " + i);
            Mantou mantou = new Mantou(i);
            syncStack.push(mantou);
        }
    }
}

class Xiaofei extends Thread{
    SyncStack syncStack = null;

    public Xiaofei(SyncStack syncStack){
        this.syncStack = syncStack;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            Mantou mantou = syncStack.pop();
            System.out.println( " pay mantou " + i);
        }
    }
}
