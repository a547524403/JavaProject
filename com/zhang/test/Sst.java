package com.zhang.test;

public class Sst {

    //属性 fields
    int id;
    String name;
    int age;

    //计算机
    Computer comp;

    //方法
    void study(){
        System.out.println("i am studying" + comp.brand);
    }

    void play(){
        System.out.println("i am playing game|| 王者荣耀");
    }

    //构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动创建
    Sst(){
    }


    //程序执行的入口，必须要有
    public static void main(String[] args) {
        Sst boy = new Sst();//创建一个对象
        boy.id = 1001;
        boy.name = "张瑞峰";
        boy.age = 18;

        Computer c1 = new Computer();
        c1.brand = "ASUS";

        boy.comp = c1;
        boy.study();
    }

    static class Computer{
        String brand;
    }
}