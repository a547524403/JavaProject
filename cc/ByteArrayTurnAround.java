package cc;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayTurnAround {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String a = "guanyonghua";
        testString(a);

        Personal personal = new Personal();
        testArray(personal);

    }

    public static void testString(String e) throws IOException {

        ByteOutputStream byteOutputStream = new ByteOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteOutputStream);
        dataOutputStream.writeUTF(e);
        byte[] bytes = byteOutputStream.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);

        dataOutputStream.close();
        byteArrayInputStream.close();

    }

    public static void testArray(Personal personal) throws IOException ,ClassNotFoundException{

        ByteArrayOutputStream boss = new ByteArrayOutputStream();
        ObjectOutputStream mi = new ObjectOutputStream(boss);
        mi.writeObject(personal);
        byte[] bytes = boss.toByteArray();

        ByteArrayInputStream biss = new ByteArrayInputStream(bytes);
        ObjectInputStream mis = new ObjectInputStream(biss);
        Personal personal1 = (Personal)mis.readObject();
        System.out.println(personal1);
        mi.close();
        biss.close();
    }
    }

    class Personal implements Serializable{
    public Personal (){
        System.out.println( " Person " );
    }
    }