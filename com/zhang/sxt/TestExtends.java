package com.zhang.sxt;

public class TestExtends {

    public static void main(String[] args) {
        Student s = new Student("高七",172,"Java");
        s.reat();
        s.study();
    }
}

class Person{

    String name;
    int height;

    public void reat(){
        System.out.println("休息一下");
    }
}

class Student extends Person{

    String major;

    public Student() {

    }

    public void study(){
        System.out.println("学习");
    }

    public Student(String name,int height,String major){

        this.name = name;
        this.height = height;
        this.major = major;

    }
}