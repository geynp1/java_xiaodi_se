package net.xdclass.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("jack", 26));
        list.add(new Student("tom", 29));
        list.add(new Student("marry", 32));
        list.add(new Student("tony", 19));
        list.add(new Student("smith", 41));

        System.out.println(list.toString());
        Student maxAgeStudent = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(maxAgeStudent);

        Student minAgeStudent = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(minAgeStudent);
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
