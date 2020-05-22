package cc.Ios.test;
import java.io.*;

class Iphone{
    private String name;
    public Iphone(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
}

class TouyingPhone{
    public Iphone phone;
    public TouyingPhone(Iphone p){
        this.phone = p;
    }

    public void show(){
        phone.show();
        System.out.println();
    }
}
public class TestDecoration {
    public static void main(String[] args) {
        Iphone phone = new Iphone("Iphone30");
        phone.show();
        System.out.println("-----------");
        TouyingPhone typhone = new TouyingPhone(phone);
        typhone.show();
    }
}
