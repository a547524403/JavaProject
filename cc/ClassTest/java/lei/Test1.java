package cc.ClassTest.java.lei;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String userName = input.nextLine();

        if (userName == null || "" == userName){
            System.out.println("不为空");
            return;
        }

        if (userName.length() <= 6) {
            System.out.println("长度大于6位");
            return;
        }

        for (int i = 0; i < userName.length();i++){
           char ch = userName.charAt(i);
           if (ch <= 57 && ch >= 48){
               System.out.println("不能有数字");
               return;
           }
        }
        System.out.println(userName);

    }

}
