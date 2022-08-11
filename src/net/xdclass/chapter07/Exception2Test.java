package net.xdclass.chapter07;

public class Exception2Test {
    public static void main(String[] args) {
        try {
            int result = 30/0;
            System.out.println("正常执行");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("进入exception块 begin");
            e.printStackTrace();
            System.out.println("进入exception块 end");
        }
    }
}
