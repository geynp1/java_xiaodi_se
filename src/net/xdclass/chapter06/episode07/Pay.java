package net.xdclass.chapter06.episode07;

//接口默认是public abstract 的关键字的
public interface Pay extends A,B{

    // public static final int money = 10;
    //int money = 10;//不建议这么写

    // public abstract boolean getOrderAmount();
    int getOrderAmount();


}
