

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 使用 httpclient 来进行get请求
 */
public class HCGET {
    public static List<UserInfo> search_fuzhou() {
        // 1.拿到一个httpclient的对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 2.设置请求方式和请求信息
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=0f42e301452145059fc79f93bdbb32cb&location=101230101");
        // 3.执行请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4.获取返回值
        String html = null;
        try {
            html = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 5.打印
//        System.out.println(html);
        htmlInfo user = JSON.parseObject(html, htmlInfo.class);
//        System.out.println(user.toString());
//        System.out.println(user.getDaily().get(0).toString());
        return user.getDaily();
    }
    public static List<UserInfo> search_beijing() {
        // 1.拿到一个httpclient的对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 2.设置请求方式和请求信息
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=0f42e301452145059fc79f93bdbb32cb&location=101010100");
        // 3.执行请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4.获取返回值
        String html = null;
        try {
            html = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 5.打印
//        System.out.println(html);
        htmlInfo user = JSON.parseObject(html, htmlInfo.class);
//        System.out.println(user.toString());
//        System.out.println(user.getDaily().get(0).toString());
        return user.getDaily();
    }
    public static List<UserInfo> search_shanghai() {
        // 1.拿到一个httpclient的对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 2.设置请求方式和请求信息
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=0f42e301452145059fc79f93bdbb32cb&location=101020100");
        // 3.执行请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4.获取返回值
        String html = null;
        try {
            html = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 5.打印
//        System.out.println(html);
        htmlInfo user = JSON.parseObject(html, htmlInfo.class);
//        System.out.println(user.toString());
//        System.out.println(user.getDaily().get(0).toString());
        return user.getDaily();
    }
}
