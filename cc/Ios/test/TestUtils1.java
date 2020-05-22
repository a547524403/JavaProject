package cc.Ios.test;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class TestUtils1 {
    public static void main(String[] args) throws Exception {
        String content = FileUtils.readFileToString(new File("d:/a.txt") , "gbk");
        System.out.println(content);
    }
}
