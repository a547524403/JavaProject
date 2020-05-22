package cc.ClassTest.java.java;
import java.io.File;
import java.io.IOException;

public class TestIOException {
    public static void main(String[] args) throws Exception {
        File file = new File("d:/sxt/b.txt");
        boolean flag = file.exists();
        if (flag){
            boolean flagd = file.delete();
            if (flagd){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            boolean flagn = true;
            try{

                File dir = file.getParentFile();
                dir.mkdirs();
                flagn = file.createNewFile();
                System.out.println("创建成功");
            }catch(IOException e){
                System.out.println("创建失败");
                e.printStackTrace();
            }
        }
        //file.renameTo(new File("d:/readme.txt"));
    }
}
