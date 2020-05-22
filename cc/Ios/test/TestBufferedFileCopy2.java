package cc.Ios.test;
import java.io.*;

public class TestBufferedFileCopy2 {
    public static void main(String[] args) {
        FileReader fr  =null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String tempString = "";
        try {
            fr = new FileReader("d:/ a.txt");
            fw = new FileWriter("d:/ b.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            while ((tempString = br.readLine()) != null){
                bw.write(tempString);
                bw.newLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (bw != null){
                    bw.close();
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }
            try{
                if (br != null){
                    br.close();
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }
            try {
                if (fw != null){
                    fw.close();
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }
            try {
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
