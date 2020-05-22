package com.zhang.sxt;

public class User {
    int id;
    String name;
    String pwd;

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User u){
        u.name = "高小七";
    }

    public void testParameterTransfer02(User u){
        u = new User(200,"高三");
    }

    public static void main(String[] args) {
        User u1 = new User(100,"高小ba");

        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
