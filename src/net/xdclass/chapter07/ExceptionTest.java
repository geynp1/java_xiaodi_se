package net.xdclass.chapter07;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int result = 25/0;
            System.out.println(result);
        } catch (Exception e) {
            String msg = e.getMessage();
            StackTraceElement[] arr = e.getStackTrace();

            e.printStackTrace();
        }

    }
}
