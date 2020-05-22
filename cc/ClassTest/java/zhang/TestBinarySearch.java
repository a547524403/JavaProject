package cc.ClassTest.java.zhang;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a,22));
    }
}
