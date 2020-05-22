package cc.test.io;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        checkAndCopy("e:\\Downloads\\Pic" , "e:\\Downloads\\q");
    }

    public static void checkAndCopy(String src,String dec) throws IOException {
        // 检查源目录
        File tFile = new File(src);

        if (!tFile.exists() || !tFile.isDirectory()){

            System.out.println("源目标不存在");

            return;
        }

        //检查目标目录，如不存在则创建

        File target = new File(dec);
        if (!target.exists()){
            target.mkdirs();
        }
        // 遍历源目录下的文件或目录

        File[] files = tFile.listFiles();
        for (int i = 0; i < files.length; i++){
            if (files[i].isFile()){
                // 源文件
                File srcFile = files[i];
                // 目标文件
                File decFile = new File(target , files[i].getName());

                copyFile(srcFile,decFile);
            }

            //递归复制子目录
            if (files[i].isDirectory()){

                // 准备复制的源文件夹
                String subsrcDIr = src + File.separator + files[i].getName();

                // 准备复制的目标文件夹
                String subdecDir = dec + File.separator + files[i].getName();

                // 复制子目录
                checkAndCopy(subsrcDIr , subdecDir);
            }
        }
    }

    public static void copyFile(File src,File dec) throws IOException {

        BufferedInputStream bufferedInputStream = null;

        BufferedOutputStream bufferedOutputStream = null;

        try {
            // 新建文件输入流
            bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
            // 新建文件输出流
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(dec));
            // 缓冲数组
            byte[] b = new byte[1024 * 5];

            int temp;

            while ((temp = bufferedInputStream.read(b)) != -1) {

                bufferedOutputStream.write(b, 0, temp);

            }
            // 刷新此缓冲的输出流
            bufferedOutputStream.flush();

        } finally {

            if (bufferedInputStream  != null){

                bufferedInputStream.close();
            }

            if (bufferedOutputStream != null){

                bufferedOutputStream.close();
            }
        }
    }
}