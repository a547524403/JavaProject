package cc.thread.test;

import org.apache.poi.ss.formula.functions.T;
import sun.security.krb5.internal.Ticket;

public class TestPicker {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TickerWindow());
        Thread t2 = new Thread(new TickerWindow());
        Thread t3 = new Thread(new TickerWindow());
        Thread t4 = new Thread(new TickerWindow());
        Thread t5 = new Thread(new TickerWindow());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class Tickets{
    int tickets;

    public Tickets(int tickets){
        this.tickets = tickets;
    }
}

class TickerWindow implements Runnable{
    int ticket = 100;                        //总票数
    int count = 0;                            //售出票

    @Override
    public void run() {
        while (ticket > 0){
            synchronized (this){
                if (ticket <= 52){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket --;
                    count ++;
                    System.out.println(Thread.currentThread().getName() + " 总票数: " + ticket);
                    System.out.println(Thread.currentThread().getName() + " 已售： " + count);
                }
            }
        }
    }
}

class Print  {
    int i;
    char c;
    private int index = 1;

     public Print(int i){
     this.i = i;
         System.out.println(i);
 }
     public synchronized void sell(Tickets tickets) {
        while ( index % 3 == 0 ) {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index++;
    }


    public Print(char c){
         this.c = c;
        System.out.println(c);
    }
    public synchronized void sellchar(Tickets tickets) {
        while ( index % 3 == 0 ) {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index++;

        while (index == 52){
            break;
        }
    }
}
