package net.xdclass.chapter06.episode07;

public interface IPay {

    // static修饰符定义静态方法
    static void staticMethod() {
        System.out.println("接口中的静态方法");
    }

    // default修饰符定义默认方法 ,默认方法不是抽象方法，可以不重写也可以重写
    default void defaultMethod() {
        System.out.println("接口中的默认方法");
    }
}
