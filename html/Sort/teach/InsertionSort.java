package html.Sort.teach;

public class InsertionSort {
    private static int[] insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
//TODO:
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//
                }else{
//接下来是无用功
                    break;
                }
            }
        }
        return arr;
    }

    /**
     *插入排序,上面的todo交换很频繁,增加很多步骤
     *@paramarr
     *@return
     */
    private static int[] insertSort2(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int indx = i;
            for(int j=i;j>0;j--){
                if(temp<arr[j-1]){
//TODO:
                    arr[j] = arr[j-1];
                    indx = j-1;
                }else{
//接下来是无用功
                    break;
                }
                arr[indx]=temp;
            }
        }
        return arr;
    }
}
