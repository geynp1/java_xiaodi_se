package net.xdclass.chapter17.service;

import com.google.gson.Gson;
import net.xdclass.chapter17.model.Response;
import net.xdclass.chapter17.util.HttpUtils;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

public class QkyRobotServiceImpl implements RobotService{

    private static final String apiTpl="http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";

    private static final Gson gson = new Gson();
    @Override
    public Response qa(String msg) {
        String api = null;
        try {
            api = String.format(apiTpl, URLEncoder.encode(msg,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String result = HttpUtils.request(api);
        //�������߼��жϣ�����null��ʱ�򣬻��߳���
        Response response = gson.fromJson(result, Response.class);

        return response;
    }
}
