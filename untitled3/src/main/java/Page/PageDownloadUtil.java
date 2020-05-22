package Page;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class PageDownloadUtil {

    public static  String getPageContent(String Url) throws IOException {

        HttpClientBuilder builder = HttpClients.custom();
        CloseableHttpClient client = builder.build();

        String content = null;
        HttpGet request = new HttpGet(Url);
        try {
            CloseableHttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) throws IOException {

        String Url = "https://www.baidu.com";
        String content = PageDownloadUtil.getPageContent(Url);
        System.out.println(content);
    }
}
