package cc.ClassTest.java.zhang;

import java.util.Arrays;

public class TestTwoArr {
    public static void main(String[] args) {
        int[] [] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[6];

        int[] [] b = { {1,2,3}, {3,4} , {3,5,6,7}  };
        System.out.println(b[2][3]);

        int[] []  c = new int[3][];
        c[0] = new int[]{1,2};
        c[1] = new int[]{2,3};
        c[2] = new int[]{4,5,6,7};
        System.out.println(c[2][3]);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));

        System.out.println(c.length);
        System.out.println(c[0].length);
    }
}
