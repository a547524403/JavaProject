import org.hamcrest.core.Is;

import java.util.Scanner;

public class IntSeparate {
    public static int Is(int n){
        if ( 2 < n || n < 58){
            if (n % 2 == 0){
                return  (n / 2) * (n / 2);
            }
          return (n / 2) * (n / 2) * (n % 2);
        }
        return n;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(Is(x));
    }
}
