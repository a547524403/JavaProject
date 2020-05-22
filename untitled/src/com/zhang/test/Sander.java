package com.zhang.test;

import java.rmi.dgc.DGC;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.random;

class Dist {

    private int max;
    private int min;
    private int avg;
    private int most;
    private int less;
    private Random cin;

    public Dist(int a, int b, int c, int d, int e) {

       max = a;
       min = b;
       avg = c;
       most = d;
       less = e;

    }

    public void setMax(int a) {
        max = a;
    }

    public void setMin(int b) {
        min = b;
    }

    public void setAvg(int c) {
        avg = c;
    }

    public void setMost(int d) {
        most = d;
    }

    public void setLess(int e) {
        less = e;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getAvg() {
        return avg;
    }

    public int getMost() {
        return most;
    }

    public int getLess() {
        return less;
    }

    public void display() {
        System.out.println(max + min + avg + most + less);
    }

}

public class Sander {
    public static <x> void main(String[] args) {
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(random);
        System.out.println( Arrays.toString(random));
        long scroe = 0L;
        int max = random[0];
        int min = random[0];
        for(int i = 0; i < random.length; i++){
            if ( max < random[i]){
                max = random[i];}
        if (min > random[i]){
            min = random[i];}
            scroe += random[i];
        }
        random(max);
        random(min);
    }
}