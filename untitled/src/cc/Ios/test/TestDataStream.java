package cc.Ios.test;
import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {

        DataOutputStream dos = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fos = new FileOutputStream("d:/ data.txt");
            fis = new FileInputStream("d:/ data.txt");
            dos = new DataOutputStream(new BufferedOutputStream(fos));
            dis = new DataInputStream(new BufferedInputStream(fis));
            dos.writeChar('a');
            dos.writeInt(10);
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            dos.writeUTF("beijing");
            dos.flush();
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (dis != null){
                    dis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (dis != null){
                    fis.close();
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
}
