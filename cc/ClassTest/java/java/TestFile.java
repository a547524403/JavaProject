package cc.ClassTest.java.java;
import java.io.File;

public class TestFile {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));

        File file = new File("a.txt");
        file.createNewFile();

        File file1 = new File("d:/b.txt");
        file1.createNewFile();
    }
}
