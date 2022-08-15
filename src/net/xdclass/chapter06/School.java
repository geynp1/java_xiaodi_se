package net.xdclass.chapter06;

public class School {
    private String name;
    private String address;
    private int age;

    private Teacher [] teachers;
    private void addTeacher(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("非法参数");
        }
        this.age = age;
    }
}
