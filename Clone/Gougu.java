import java.util.Scanner;

public class Gougu {
    public static boolean gougu(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b ||  c * c + b * b == a * a && a != 0 && b != 0 && c != 0 &&
                a <= 1000 && b <= 1000 && c <= 1000) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(gougu(a,b,c));
    }
}
