package net.xdclass.chapter07;

public class Exception2Test {
    public static void main(String[] args) {
        try {
            int result = 30/0;
            System.out.println("����ִ��");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("����exception�� begin");
            e.printStackTrace();
            System.out.println("����exception�� end");
        }
    }
}
