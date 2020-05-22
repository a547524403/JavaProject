package com.zhang.sxt;

class Persons {

    String name;
    int age;

    @Override
    public String toString(){
        return name+age;
    }
}

public class TestToString{
    public static void main(String[] args) {
        Persons p = new Persons();
        p.age = 20;
        p.name = "李东";

        System.out.println(p);

        TestToString t = new TestToString();
        System.out.println(t);
    }
}
