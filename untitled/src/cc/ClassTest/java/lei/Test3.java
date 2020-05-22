package cc.ClassTest.java.lei;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        for (Car car:Car.values()){
            System.out.println(car);
        }
        int a = new Random().nextInt(2);
        switch (Night.values()[a]){
            case RED:
                System.out.println("停车");
                break;
            case YELLOW:
                System.out.println("等一等");
                break;
            case GREEN:
                System.out.println("通行");
                break;
        }
    }
}

enum Car{
    通行,等一等,停车
}

enum Night{
    RED,YELLOW,GREEN;
}
