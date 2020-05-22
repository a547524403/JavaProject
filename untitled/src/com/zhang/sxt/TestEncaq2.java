package com.zhang.sxt;

//进行封装

class Per2{
    private String name;
    private int age;

    public Per2(){
    }

    public Per2(String name,int age){
        this.name = name;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setAge(int age){

        if (age > 130 || age < 0){
            this.age = 18;
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name+age;
    }
}

public class TestEncaq2 {
    public static void main(String[] args) {
        Per2 p1 = new Per2();
        p1.setName("小红");
        p1.setAge(-45);

        System.out.println(p1);


        Per2 p2 = new Per2("小白",45);
        System.out.println(p2);
    }
}
