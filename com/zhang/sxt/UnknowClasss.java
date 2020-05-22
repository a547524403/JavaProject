package com.zhang.sxt;

public class UnknowClasss {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3));
        System.out.println(s2.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.indexOf("Apple"));
        String s = s1.replace("","@");


        String s3 = "";
        String s4 = "How are you";

        System.out.println(s4.startsWith("How"));
        System.out.println(s4.endsWith("you"));

        s1.substring(4);
        System.out.println(s1);

        s1.substring(4,7);
        System.out.println(s1);

        s4 = s2.toLowerCase();
        System.out.println(s4);

        s4 = s1.toUpperCase();
        System.out.println(s4);

        String s5 = "  How old  ";
        s = s5.trim();

        System.out.println(s);
        System.out.println(s4);
    }



}