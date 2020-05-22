package cc.Ios.test;
import java.io.*;
import java.util.Date;

public class TEstObjectStream {
    public static void main(String[] args) throws IOException , ClassCastException{

    }
public static void write(){
      OutputStream os = null;
      BufferedOutputStream bos = null;
      ObjectOutputStream oos = null;
      try{
          os = new FileOutputStream(new File("d:/ a.txt"));
          bos = new BufferedOutputStream(os);
          oos = new ObjectOutputStream(bos);

          oos.writeInt(12);
          oos.writeDouble(3.14);
          oos.writeChars("A");
          oos.writeBoolean(true);
          oos.writeUTF("beijing");

          oos.writeObject(new Date());
      }catch (IOException e){
          e.printStackTrace();
      }finally {
          if (oos != null){
              try {
              oos.close();
          }catch(IOException e){
              e.printStackTrace();
              }
          }
          if (bos != null){
              try{
                  bos.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
          }
          if (os != null){
              try {
                  os.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
          }
      }
}

public static void read(){
        InputStream is = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            is = new FileInputStream(new File("d:/a.txt"));
            bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);

            System.out.println(ois.readInt());
            System.out.println(ois.readDouble());
            System.out.println(ois.readChar());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readUTF());
            System.out.println(ois.readObject().toString());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (ois != null){
                try{
                    ois.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bis != null){
                try{
                    bis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (is != null){
                try{
                    is.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

}
}
