package com.zhang.sxt;

public class TestInnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = new Outer().new Inner();

        inner.show();
    }
}

class Outer{

    private int age = 10;

    public void testOuter() {
    }
        class Inner{

            int age = 20;
            public void show(){

                int age = 30;

                System.out.println(Outer.this.age);
                System.out.println(this.age);
                System.out.println(age);
            }
        }
    }
