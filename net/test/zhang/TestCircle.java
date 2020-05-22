package net.test.zhang;

public class TestCircle {

    public static void test01(){
        Circle c = new Circle();
        System.out.println(c.getArea(5));
        System.out.println(c.getPerimeter(5));
    }

    public static void main(String[] args) {
        TestCircle.test01();
    }

}
