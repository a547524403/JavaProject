package net.test.zhang;

import java.util.Scanner;

public class Circle {

    double r;

    public static double getArea(double r){
      return  2*3.14*r;
    }

    public static double getPerimeter(double r){
      return  3.14*r*r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextInt();

        System.out.println(getArea(i));
        System.out.println(getPerimeter(i));
    }

    public static class test{

        public static void test01(){
            Circle c = new Circle();
            System.out.println(c.getArea(5));
            System.out.println(c.getPerimeter(5));
        }
    }
}
