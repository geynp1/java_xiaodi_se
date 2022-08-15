package net.xdclass.chapter06;

/**
 * 6-2
 *
 */
public class MainTest {
    public static void main(String[] args) {
//       test2();
        test3();
    }

    public static void test3() {
        User user = new User();
        user.sleep();
    }

    public static void test2() {
        String name = "二当家";
        int age =5;
        User u = new User(name, age);
        System.out.println(u.getName());
    }

    public static void test1(){
        User user = new User();
        System.out.println(user.getAge());
//        user.setAge(10);
//        user.setName("小D");
//        System.out.println(user.getName());
    }
}
