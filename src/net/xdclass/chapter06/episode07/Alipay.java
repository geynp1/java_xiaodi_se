package net.xdclass.chapter06.episode07;

public class Alipay implements IPay{
    @Override
    public void defaultMethod() {
        System.out.println("重写后的方法");
    }
}
