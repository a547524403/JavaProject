package cc.Ios.test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestUtils2 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectory(new File("d:/aaa"), new File("d:/bbb"), new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().endsWith("html")){
                    return true;
                }else {
                    return false;
                }
            }
        });
    }
}
