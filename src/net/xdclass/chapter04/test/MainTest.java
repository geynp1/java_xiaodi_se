package net.xdclass.chapter04.test;

import net.xdclass.chapter04.episode02.Father;
import net.xdclass.chapter04.episode03.Person;
import net.xdclass.chapter04.episode03.Student;

public class MainTest extends Person{
    public static void main(String[] args) {
        System.out.println("Œ“ «mainTest");
//        Father father = new Father();
        //father.test();
//        MainTest mainTest = new MainTest();
//        mainTest.test2();
        Person person = new Person();
//        person.printName();
//        System.out.println(person.name);
//        MainTest mainTest = new MainTest();
//        System.out.println(mainTest.name);
        Student student = new Student();
        student.learn();
    }
}
