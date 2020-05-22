package com.zhang.sxt;

abstract class Animal{
    abstract public void shout();
}

class Dogs extends Animal{
    public void shout(){
        System.out.println("汪");
    }

    public void seeDppr(){
        System.out.println("看门");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Dogs a = new Dogs();
        a.shout();
        a.seeDppr();
    }
}
