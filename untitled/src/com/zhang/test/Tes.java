package com.zhang.test;

public class Tes {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum);
        for (int i = 1;i < 10;i++){
            do{
             i++;
             if (i % 2 != 0)
                 sum += i;
                System.out.println(sum);
            }while (i < 6);
        }
        System.out.println(sum);
    }
}
