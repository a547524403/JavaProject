package cc.Ios.test;
import org.openqa.jetty.util.IO;

import java.io.*;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestFileCopy {
    public static void main(String[] args) {
        copyFile("d:/ a.txt","d:/ b.txt");
    }

    private static void copyFile(String src,String dec) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buffer = new byte[1024];
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            while ((temp = ((FileInputStream) fis).read(buffer)) != -1){
                fos.write(buffer,0,temp);
            }
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
            try{
                if (fis != null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}