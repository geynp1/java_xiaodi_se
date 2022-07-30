package net.xdclass.chapter16;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class URLTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.xdclass.net/pub/api/v1/web/all_category");
        System.out.println("getHost="+url.getHost());
        System.out.println("getProtocol="+url.getProtocol());
        System.out.println("getPort="+url.getPort());
        System.out.println("getQuery="+url.getQuery());
        System.out.println("getFile="+url.getFile());//getPath和getQuery的组合

        HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        if (200 <= responseCode && responseCode <= 299) {
            try (InputStream inputStream = httpURLConnection.getInputStream();
                 InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                 BufferedReader in = new BufferedReader(inputStreamReader)) {

                StringBuilder response = new StringBuilder();

                String currentLine;

                while ((currentLine = in.readLine()) != null) {
                    response.append(currentLine);
                }
                String jsonStr = response.toString();
                System.out.println(response.toString());
                Gson gson = new Gson();
                Map<String,Object> objectMap = gson.fromJson(jsonStr, Map.class);
                Object codeObj = objectMap.get("code");
                System.out.println(codeObj);


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
