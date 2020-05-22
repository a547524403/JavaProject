package com.zhang.sxt;

import java.sql.Date;
import java.util.*;
import com.zhang.test.Digui;

import static com.zhang.test.Digui.jc;

public class Test {
    public static void main(String[] args) {
        Date now;
        java.util.Date now2 = new java.util.Date();
        System.out.println(now2);
        Scanner input = new Scanner(System.in);

        Digui digui = new Digui();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(jc(i));

    }
}