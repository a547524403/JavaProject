package cc.Ios.test;
import java.io.*;

public class TestFileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        String string = "beijing";
        try {
            fos = new FileOutputStream("d:/ a.txt",true);
            fos.write(string.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (fos != null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
