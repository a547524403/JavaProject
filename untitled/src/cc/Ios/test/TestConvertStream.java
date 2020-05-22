package cc.Ios.test;
import java.io.*;

public class TestConvertStream {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str = br.readLine();
            while (!"exit".equals(str)){
                bw.write(str);
                bw.newLine();
                bw.flush();

                str = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
