package com.zhang.sxt;

public class TestInstanceof {
    public static void main(String[] args) {
        Student s = new Student("高七",172,"Java");
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
    }
}
