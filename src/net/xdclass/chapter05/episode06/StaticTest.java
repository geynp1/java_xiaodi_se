package net.xdclass.chapter05.episode06;

import java.io.PrintStream;

public class StaticTest {
    public static void main(String[] args) {

        Student.age =10;

        Student student1 = new Student();
        student1.name = "С��1";

        Student student2 = new Student();
        student2.name = "С��2";

        Student student3 = new Student();
        student3.name = "С��3";

        System.out.println(student1.name);
        System.out.println(student1.getAge());
        System.out.println(student2.name);
        System.out.println(student2.getAge());
        System.out.println(student3.name);
        System.out.println(student3.getAge());
    }
}
