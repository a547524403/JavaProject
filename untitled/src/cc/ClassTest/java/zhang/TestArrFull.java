package cc.ClassTest.java.zhang;

import java.util.Arrays;

public class TestArrFull {
    public static void main(String[] args) {
        int[] a = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));
    }
}
