package com.zhang.test;

public class Company {
        public static void main(String[] args) {// 计算5位学生的和以及平均分(60,80,90,70,85)
            int[] score = { 60, 80, 90, 70, 85 };
            int sum = 0;
            for (int i = 0; i < score.length; i++) {
                sum += score[i];
            }
            double avg = sum / score.length;
            System.out.println("5位学生的和:" + sum);
            System.out.println("5位学生的平均分:" + avg);
        }
    }
