package cc.Ios.test;
import java.io.*;

public class TestByteArray {
    public static void main(String[] args) {
        byte[] b = "abcdefg".getBytes();
        test(b);
    }
    public static void test(byte[] b){
        ByteArrayInputStream bals = null;
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        int num = 0;
        try {
            bals = new ByteArrayInputStream(b);
            while ((temp = bals.read()) != -1){
                sb.append((char)temp);
                num++;
            }
            System.out.println(sb);
            System.out.println(num);
        }finally {
            try {
                if (bals != null){
                    bals.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
