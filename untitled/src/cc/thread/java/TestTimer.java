package cc.thread.java;

import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        MyTask task = new MyTask();

        timer1.schedule(task,3000);
        timer1.schedule(task,5000,1000);
        GregorianCalendar calendar = new GregorianCalendar(2010,0,5,14,36,57);
        timer1.schedule(task,calendar.getTime());
    }
}

class MyTask extends TimerTask{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println( " task: " + i);
        }
    }
}