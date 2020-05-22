package cc.Ios.test;
import java.io.*;
import org.apache.commons.io.IOUtils;

public class TestUtils3 {
    public static void main(String[] args) throws Exception {
        String content = IOUtils.toString(new FileInputStream("d:/a.txt") , "gbk");
        System.out.println(content);
    }
}
