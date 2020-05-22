package cc.ClassTest.java.lei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        String point = scanner.nextLine();
        String daytime = scanner.nextLine();

        Integer i = Integer.valueOf(age);
        Double d = new Double(point);

        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        daytime = s1.format(new Date());

        System.out.println(i);
        System.out.println(d);
        System.out.println(daytime);
    }
}
