package cc.ClassTest.java.java;
import java.util.Random;

public class TestEnums {
    public static void main(String[] args) {
        for (Week k : Week.values()) {
            System.out.println(k);
        }
        int a = new Random().nextInt(4);
        switch (Season.values()[a]) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINDTER:
                System.out.println("冬天");
                break;
        }
    }
}
    enum Season{
        SPRING,SUMMER,AUTUMN,WINDTER
    }

    enum Week{
        星期一,星期二,星期三,星期四,星期五,星期六,星期日
    }