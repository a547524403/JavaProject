package cc.Ios.test;

import java.io.*;

public class TestBufferedFileCopy {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        long time2 = System.currentTimeMillis();
        long time3 = System.currentTimeMillis();
        long time4 = System.currentTimeMillis();
    }

    static void copyFile1(String src , String dec){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        int temp = 0;
        try{
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            while ((temp = bis.read()) != -1){
                bos.write(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (bos != null){
                    bos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (bis != null){
                    bis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fos != null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fis != null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static void copyFile2(String src,String dec){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            while ((temp = fis.read()) != -1){
                fos.write(temp);
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
