package com.zhang.sxt;

//多态和类型的转换

import cn.sxt.gao006.Animal;

class Animals{
    public void shout(){
        System.out.println("叫");
    }
}

class Dog extends Animals{
    public void shout(){
        System.out.println("汪");
    }

    public void seeDoor(){
        System.out.println("看门");
    }
}

class Cat extends Animals{
    public void shout(){
        System.out.println("喵");
    }

    public void eat(){
        System.out.println("吃鱼");
    }
}

public class TestPolym {
    public static void main(String[] args) {

        Animals a1 = new Animals();  //向上可以自动转型
        animalsCry(a1);          //传的具体是哪一个类就调用哪一个类的方法

        Animals a2 = new Dog();
        animalsCry(a2);

        Animals a3 = new Cat();
        animalsCry(a3);
    }

        static void animalsCry(Animals a){
            a.shout();
        }
}
