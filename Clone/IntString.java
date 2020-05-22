import java.util.ArrayList;
import java.util.List;

public class IntString{
    public static void main(String[] args){
        int num[] = {83,6,17,-84,184,367};
        List<int[]> list = new ArrayList<>();

        for(int i = 0;i<num.length;i++){
        for(int j = i+1;j<num.length;j++){
        if(num[i] + num[j] == 100){
        list.add(new int[]{num[i],num[j]});
        }
        }
        }

        // print
        for(int i = 0;i<list.size();i++){
        System.out.printf("%d: %d %d\n",i,list.get(i)[0],list.get(i)[1]);
        }
    }
}
