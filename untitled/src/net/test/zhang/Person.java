package net.test.zhang;

public class Person{
    String name;
    int age;

    public void display(){
        System.out.println("姓名:" + name + " " + "年龄:" + age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person u1 = new Person("张三", 59);
        u1.display();
    }
}