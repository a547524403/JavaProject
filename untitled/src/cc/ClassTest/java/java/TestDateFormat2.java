package cc.ClassTest.java.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat2 {
    public static void main(String[] args) {
        SimpleDateFormat s1 = new SimpleDateFormat("0");
        String daytime = s1.format(new Date());
        System.out.println(daytime);
    }
}
