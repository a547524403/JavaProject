package com.zhang.test;

public class TestOverload{

    private Object Person;

    void Person(int id, int age, int sex){
        String Sex = "";
        if (sex == 1){
            Sex = "man";
        }else if( sex == 2){
            Sex = "lady";
        }else{
            Sex = "Error";
        }
        System.out.println(id + "-" + age + "-" + Sex);
    }
    
    public static void main(String[] args) {
      TestOverload p = new TestOverload();
      TestOverload p1 = new TestOverload();
      TestOverload p2 = new TestOverload();
      p.Person (10,30,1);
      p1.Person(11,22,2);
      p2.Person(12,23,3);
    }
}