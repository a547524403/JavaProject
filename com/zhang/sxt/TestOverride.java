package com.zhang.sxt;

public class TestOverride {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Horse();
        Vehicle v3 = new Plane();
        v1.run();
        v2.run();
        v3.run();
        v2.stop();
        v3.stop();
    }
}

class Vehicle{

    public void run(){
        System.out.println("跑");
    }

    public void stop(){
        System.out.println("停");
    }

    public Person whoIsPsg(){
        return new Person();
    }
}

class Horse extends Vehicle{

    public void run(){
        System.out.println("四蹄翻飞");
    }

    public Student whoIsPsg(){
        return new Student();
    }
}

class Plane extends Vehicle{

    public void run(){
        System.out.println("天上飞");
    }

    public void stup(){
        System.out.println("不能停");
    }

}
