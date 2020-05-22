package com.zhang.test;

import java.math.*;
import java.util.*;
import java.lang.*;

public class Dijia {
    public static int dj(int n) {
        if (n < 1) {
            return 0;
        }
            return dj(n - 1) + n;
        }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dj(n));
    }
}