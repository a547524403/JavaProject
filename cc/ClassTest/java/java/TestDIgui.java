package cc.ClassTest.java.java;
import java.io.File;

public class TestDIgui {
    public static void main(String[] args) {
        File f = new File("d:/电影");
        printFile(f,0);
    }

    static void printFile(File file,int level){
     for (int i = 0;i < level;i++){
         System.out.println("-");
     }
        System.out.println(file.getName());
     if (file.isDirectory()){
         File[] files = file.listFiles();
         for (File temp : files){
             printFile(temp,level +1);
         }
     }
    }
}
