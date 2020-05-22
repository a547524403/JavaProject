package com.zhang.sxt;

//飞行接口
interface Volant{
    public static final int FLY_HIGHT = 100;
    public abstract void fly();
}

//善良接口
interface Honest {
    public abstract void helpOther();
}

class Angel implements Volant,Honest{

    public void fly() {
        System.out.println("i am a Angle,i will be fly");
    }

    public void helpOther() {
        System.out.println("i must help you");
    }
}

class Goodman implements Honest{

    public void helpOther(){
        System.out.println("i will kill you");
    }
}

class BirdMan implements Volant{

    public void fly(){
        System.out.println("i am the bird man");
    }
}
    public class TestInterface {
        public static void main(String[] args) {
            Volant volant = new Angel();
            volant.fly();
            System.out.println(Volant.FLY_HIGHT);

            Honest honest = new Goodman();
            honest.helpOther();
        }
}
