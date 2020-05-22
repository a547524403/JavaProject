package cc.Ios.test;

import mx4j.tools.remote.soap.axis.ser.PrincipalSer;

import java.io.*;

class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    int age;
    boolean isMan;
    String name;
    public Person(int age,boolean isMan, String name){
        super();
        this.age = age;
        this.isMan = isMan;
        this.name = name;
    }

    public String toString(){
        return "age" + age + "sex" + isMan + "name" + name;
    }
}
public class TestSerializable{
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {

            Person person = new Person(18,true,"gaoqi");

            fos = new FileOutputStream("d:/a.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.flush();

            fis = new FileInputStream("d:/ c.txt");
            ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (oos != null){
                try {
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (ois != null){
                try {
                    ois.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
