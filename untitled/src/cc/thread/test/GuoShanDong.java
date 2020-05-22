package cc.thread.test;
import java.util.*;

public class GuoShanDong implements Runnable {

    public static int deng = 0;

    @Override
    public void run() {

        deng = deng + 5000;

        try {
            Thread.sleep(deng);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "  Pass the Mountain");
    }

    public static void main(String[] args) {
        String[] ary = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        GuoShanDong gsd = new GuoShanDong();

        Set<Integer> set = new LinkedHashSet<Integer>();
        while(true){
            if (set.size() == 10){
                break;
            }

            //随机乱序排列
            int a = (int)(Math.random() * 10);

            set.add(a);

        }

        for (int b : set ){
            Thread thread = new Thread(gsd,ary[b]);
            thread.start();
        }
    }
}
