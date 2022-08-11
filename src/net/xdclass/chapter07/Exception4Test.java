package net.xdclass.chapter07;

public class Exception4Test {
    public static void main(String[] args) throws Exception {
//        try {
//            int result = divide(25, 0);
//            System.out.println("result="+result);
//        } catch (Exception e) {
//            System.out.println("main有异常");
//        }
        int result = divide(25, 0);
    }

    public static int divide(int num1, int num2) throws  Exception {
        try {
            int result  = num1/num2;
            return result;
        } catch (Exception e) {
            System.out.println("出异常了");
            throw new Exception("参数异常");
        }
    }
}
