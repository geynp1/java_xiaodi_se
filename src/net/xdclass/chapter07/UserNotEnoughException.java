package net.xdclass.chapter07;

/**
 * 自定义异常类
 */
public class UserNotEnoughException extends Exception{
    private int code;
    private String msg;

    public UserNotEnoughException(){
        super();
    }

    public UserNotEnoughException(int code,String msg){
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getmsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }
}
