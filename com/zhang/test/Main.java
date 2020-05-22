package com.zhang.test;

import java.math.*;

public class Main {
    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);  //0.5
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
    }
}