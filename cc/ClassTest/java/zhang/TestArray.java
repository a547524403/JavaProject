package cc.ClassTest.java.zhang;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        String[] msIdNum = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k"};

        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        for(String str: msIdNum) {
            if (str == key){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}