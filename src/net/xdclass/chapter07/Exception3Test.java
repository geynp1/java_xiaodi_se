package net.xdclass.chapter07;

public class Exception3Test {
    public static void main(String[] args) {
        int result = divide(25, 0);
        System.out.println("���ս��="+result);
    }

    public static int divide(int num1, int num2) {
        try {
            int result = num1/num2;
            return result;
        } catch (Exception e) {
            System.out.println("���쳣��");
        }finally {
            System.out.println("finallyִ����");
            return -2;
        }
//        return -1;
    }
}
