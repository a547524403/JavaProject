package com.zhang.test;

import java.util.Scanner;

public class Digui {

    public static int jc(int i){
        if (i == 1){
            return 1;
        }
        return jc(i - 1) * i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(jc(i));
    }
}
