package com.zhang.test;

public class Breach {
    public static void main(String[] args) {
        int total = 0; //定时计数器
        System.out.println("Begin");
        while (true) {
            total++;
            int i = (int) Math.round(100 * Math.random());
            if (i == 88) {
                break;
            }
        }
        System.out.println(" Game over, Used " + total + "time.");
    }
}