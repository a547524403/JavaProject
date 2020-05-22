package cc.ClassTest.java.zhang;

import java.util.*;

public class TestArrays02 {

    private static int[] arr = new int[50];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * j);
        }
        mind(arr);
        Moster(arr);
        Lesset(arr);
        Most60(arr);

    }

    private static void mind(int[] random) {
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
    }

    private static void Moster(int[] random) {
        int max = random[0];
        for (int i = 0; i < random.length; i++) {
            if (max < random[i]) {
                max = random[i];
            }
        }
        System.out.println(max);
    }

    private static void Lesset(int[] random) {
        int min = random[0];
        for (int i = 0; i < random.length; i++) {
            if (min > random[i]) {
                min = random[i];
            }
        }
        System.out.println(min);
    }

    private static void Most60(int[] random) {
        int j = 0;
        for(int i=0;i<random.length;i++) {
            if(random[i]>=60) {
                j=j+1;
            }
        }
        System.out.println(j);
    }
}