package cc.Ios.test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestIo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/ a.txt");
            StringBuilder sb = new StringBuilder();
            int temp = 0;

            while ((temp = fis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}