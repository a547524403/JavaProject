package cc.ClassTest.java.zhang;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = { 3,1,6,2,9,0,7,4,5,8};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void bubbleSort(int[] vanles){
        int temp;
        for (int i = 0;i < vanles.length;i++){
            for (int j = 0;j < vanles.length -1 -i; j++){
                if (vanles[j] > vanles[j+1]){
                    temp = vanles[j];
                    vanles[j] = vanles[j+1];
                    vanles[j+1] = temp;
                }
            }
        }
    }
}
