package net.xdclass.chapter05.episode06;

public class Student {

    static String sex;

    static {
        sex = "男生";
        System.out.println("静态代码块被执行了");
    }

    static int age;

    String name;

    public int getAge(){
        return age;
    }
}
