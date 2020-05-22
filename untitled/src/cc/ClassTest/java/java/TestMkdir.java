package cc.ClassTest.java.java;
import java.io.File;

public class TestMkdir {
    public static void main(String[] args) throws Exception {
        File f = new File("d:/ e.txt");
        f.createNewFile();
        f.delete();
        File f2 = new File("d:/电影/华语/大陆");
        boolean flag = f2.mkdir();
        System.out.println(flag);
    }
}
