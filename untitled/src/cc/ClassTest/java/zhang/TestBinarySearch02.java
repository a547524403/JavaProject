package cc.ClassTest.java.zhang;

import java.util.Arrays;

public class TestBinarySearch02 {
    public static void main(String[] args) {
        int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
        int SearchKey = 20;
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,20));
    }

    public static int binarySearch(int[]  array, int value){
        int low = 0;
        int high = array.length -1;
        while (low <= high){
            int middle = ( low + high) / 2;
            if (value == array[middle]){
                return middle;
            }if (value > array[middle]){
                low =  middle + 1;
            }if (value < array[middle]){
                high = middle -1;
            }
        }
        return -1;
    }
}
