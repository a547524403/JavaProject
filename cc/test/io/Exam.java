package cc.test.io;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) throws IOException{
        String path = "e:\\exam.txt";
        OutputMethod(path);
    }

    public static void OutputMethod(String path) throws IOException{

        //创建集合对象
        List<String> list = new ArrayList<String>();

        //创建缓冲区对象
        BufferedReader br = new BufferedReader(new FileReader(path));

        //读取数据每一行
        String line = br.readLine();
        while(line != null){
            list.add(line);
            line = br.readLine();
        }

        //关闭
        br.close();

        for (String s : list){
            System.out.println(s);
        }
    }
}
