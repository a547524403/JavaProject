import java.util.ArrayList;
import java.util.List;

public class IntSub {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0;i<num.length;i++){
            if (num[i] % 2 == 0){
                System.out.println(num[i]);
            }
        }
    }
}
