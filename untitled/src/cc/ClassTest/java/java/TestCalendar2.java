package cc.ClassTest.java.java;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();

        System.out.println(dateString);
        String[] str = dateString.split("-");
        int year = Integer.parseInt(str[0]);
        int month = new Integer(str[1]);
        int day = new Integer(str[2]);
        Calendar c = new GregorianCalendar(year,month -1,day);
        c.set(Calendar.DATE,1);
        int dow = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < dow - 1;i++){
            System.out.println("\t");
        }

        int maxDate = c.getActualMaximum(Calendar.DATE);

        for (int i = 1;i <= maxDate;i++){
            StringBuilder sBuilder = new StringBuilder();
            if (c.get(Calendar.DATE) == day){
                sBuilder.append(c.get(Calendar.DATE) + "*\t");
            }else{
                sBuilder.append(c.get(Calendar.DATE) + "\t");
            }
            System.out.println(sBuilder);

            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                System.out.print("\n");
            }
            c.add(Calendar.DATE,1);
        }
    }
}
