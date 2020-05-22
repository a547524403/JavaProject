package com.zhang.test;

import java.util.*;
import java.lang.*;

public class Sui {
    public static void main(String[] args) throws Exception {
        int[] random = new int[10];
        for (int n = 0; n < random.length; n++) {
            random[n] = (int) (Math.random() * 100);    }   // 获取十个10以内的随机数
        Arrays.sort(random);
        System.out.println("数组从小到大排列为" + Arrays.toString(random)); //  将获取的十个随机数从小到大排列
        int i = random[random.length / 2];
        int max = random[0];
        int min = random[0];
        double score = 0;
        for (int n = 0; n < random.length; n++) {
            if (max < random[n]) {
                max = random[n];
            }
            if (min > random[n]) {
                min = random[n];
            }
            score += random[n];    // 计算十个随机数的和
        }
        double avg = (double) score / random.length;
        System.out.println("数组的和" + score);
        System.out.println("数组的平均值" + avg);
        System.out.println("数组的最大值" + max);
        System.out.println("数组的最小值" + min);
        System.out.println("数组的中位数" + i);
    }
}