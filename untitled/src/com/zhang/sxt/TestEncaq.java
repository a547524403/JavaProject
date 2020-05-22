package com.zhang.sxt;

//未进行封装

class Human{
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }


class Per extends Human {
    private String name;
    private int age;
    }

    @Override
    public String toString(){
        return name+age;
    }

}

public  class TestEncaq {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(15);
        h1.setName("张");
        //  p.name = "小红";
        //  p.age = -45;   //age可以通过这种方式随意赋值，没有限制
        System.out.println(h1);
    }
}