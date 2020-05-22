import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlText {
    /***
     * 获取文本
     *
     * @param autoDownloadFile
     *            自动下载文件
     * @param Multithreading
     *            多线程 默认false
     * @param Url
     *            网站链接
     * @throws IOException
     */
    public static void getText(boolean autoDownloadFile, boolean Multithreading, String Url) throws IOException {

        String rule = "abs:href";
        List<String> urlList = new ArrayList<String>();

        Document document = Jsoup.connect(Url)
                .timeout(4000)
                .ignoreContentType(true)
                .userAgent("Mozilla\" to \"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:50.0)")
                .get();

        System.out.println(document.toString());
        Elements urlNode = document.select("a[href$=.html]");

        for (Element element : urlNode) {
            urlList.add(element.attr(rule));
        }
        CrawTextThread crawTextThread = new CrawTextThread(urlList);
        crawTextThread.start();
    }
}
class CrawTextThread extends Thread {

    List<String> UrlList;
    public CrawTextThread(List<String> urlList) {
        this.UrlList = urlList;
    }

    String rule = "";
    String rule_title = "h1";
    String rule_content = "content";

    public static String PATH = "e:\\JSOUP\\";
    /**
     * 创建文件
     *
     * @param fileName
     * @return
     */
    public static void createFile(File fileName) throws Exception {
        try {
            if (!fileName.exists()) {
                fileName.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeTxtFile(String content, File fileName) throws Exception {
        RandomAccessFile mm = null;
        FileOutputStream o = null;
        try {
            o = new FileOutputStream(fileName);
            o.write(content.getBytes("UTF-8"));
            o.close();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            if (mm != null) {
                mm.close();
            }
        }
    }

    @Override
    public void run() {
        currentThread().setName("一个都别跑:");

        String title;

        String content;

        for (String url : UrlList) {
            try {

                Document document = Jsoup.connect(url).timeout(6000).get();
                title = document.select("h1").toString();
                content = document.select("#content").html();

                System.out.println("线程:"+currentThread().getName()+"爬取URL—>"+url);
                File file = new File(PATH+title.replaceAll("<h1>", "").replaceAll("</h1>", "")+".txt");
                createFile(file);
                System.out.println("创建文件:"+file.getPath());
                writeTxtFile(FileterHtml(content), file);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static String FileterHtml(String str) {
        return str.replaceAll(" ", "").replaceAll("<br>", "\r\n");

    }

    public static void main( String[] args )
    {
        try {
            CrawlText.getText(true, true, "https://demo.onpre.cn:7001/#/home");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}