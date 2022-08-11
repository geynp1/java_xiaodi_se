package net.xdclass.chapter07;

public class StudentTest {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try {
            Student student = new Student();
            student.setAge(-1);
        } catch (NullPointerException e) {
            System.out.println("出异常了 NullPointerException");
        } catch (IllegalArgumentException e) {
            System.out.println("出异常了 IllegalArgumentException");
        }
    }
}
