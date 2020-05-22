package cc.ClassTest.java.java;
import java.io.File;
import java.util.Date;

public class TestFile2 {
    public static void main(String[] args) throws Exception {
        File f = new File("d:/c.txt");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.length());
        System.out.println(f.getName());
        System.out.println(f.getPath());
    }
}
