package com.zhang.test;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Cgain {

    private static int N = 100;
    private static int[] random;

    public static void main(String[] args) throws Exception {
            int[] random = new int[N];

            for (int i = 0; i < random.length; i++)
                random[i] = (int) (Math.random() * N);
        System.out.println("/n----Start----/n");

                mind(random);
                avg(random);
                mostlist(random);
                lesslist(random);
                mostNum(random);
                zhong(random);
                present(random);
                remove(random);
    }

    //数据排列
    private static void mind(int[] random) {
        Arrays.sort(random);
        System.out.println("数据从小到大排列为：" + Arrays.toString (random));
    }

    // 去重
    private static void remove(int[] random) {

        for (int i = 0; i < random.length; i++) {
            for (int j = i; j < random.length - 1; j++) {
                if (random[i] == random[j + 1]) {
                    random[j + 1] = 0;
                }
            }
        }
        java.util.Arrays.sort(random);

        for (int i = 0; i < random.length; i++) {
            if (random[i] != 0) {
            }
            System.out.println("去重：" + random[i] + " ");
        }
    }

    //平均数
    private static void avg(int[] random) {
        double sum = 0;
        for (int i = 0 ; i < random.length;i++){
            sum += random[i];
        }
        System.out.println("平均数："+ sum / random.length );
    }

    //最大值
    private static void mostlist(int[] random) {
        int max = random[0];

        for (int i = 0; i < random.length;i++){
        if (max < random[i]){
           max = random[i];
           }
        }
        System.out.println("最大值：" + max);
    }

    //最小值
    private static void lesslist(int[] random){
        int min = random[0];

        for (int i = 0;i < random.length;i++){
            if (min > random[i]){
                min = random[i];
            }
        }
        System.out.println("最小值：" + min);
    }

    //中位数
    private static void zhong(int[] random) {
        int zhong = random[random.length/ 2];
        System.out.println("中位数：" + zhong);
    }

    //概率
    private static void present(int[] random){
        System.out.println("每个数字的概率");
        int[] counts = new int[N];

     for (int i = 0 ; i < random.length;i++){
        counts[random[i]]++;
         }

     for (int i = 0; i < random.length;i++){
         System.out.printf("[%d]:%.2f\n",i, counts[i] / 100.0);
       }
        System.out.println("");
    }

    //众数
    private static void mostNum(int[]random){

        System.out.println("众数:" );
        int[] counts = new int[random.length];

        for (int i = 0;i < random.length;i++){
            counts[random[i]]++;
        }
    }
}