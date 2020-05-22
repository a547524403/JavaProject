package cc.Ios.test;
import java.io.*;

public class TestRandomStream {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try{
            int[] data = {10,20,30,40,50,60,70,80,90,100};
            raf = new RandomAccessFile("d:/ a.txt" , "rw");
            for (int i = 0 ; i < data.length ; i++){
                raf.writeInt(data[i]);
            }
            raf.seek(4);
            System.out.println(raf.readInt());

            for (int i = 0; i < data.length; i++ ){
                raf.seek(i * 4);
                System.out.println(raf.readInt() + "\t");
            }
            System.out.println();

            raf.seek(8);
            raf.writeInt(45);
            for (int i = 0 ; i < data.length ; i++){
                raf.seek(i * 4);
                System.out.println(raf.readInt() + "\t");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (raf != null){
                try{
                    raf.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
