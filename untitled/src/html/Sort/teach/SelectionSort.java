package html.Sort.teach;

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            // 初始化未排序序列中最小数据数组下标
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 将未排序列中最小元素放到已排序列末尾
            if (min != i) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
