package net.xdclass.chapter17.model;

public class Request {
    private String key = "free";

    private String appid = "0";

    private String msg = "";

    //�޲ι��캯��
    public Request() {
    }
    //�вι��캯��
    public Request(String msg) {
        this.msg = msg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
