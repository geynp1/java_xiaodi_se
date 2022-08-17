package net.xdclass.chapter04.episode07;

public class Student {

    public static String PREFIX = "我是";

    private int age;

    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String introduce(){

        String content = "我的自我介绍";
        int a = 0;

        System.out.println(a);
        System.out.println(content);


        return content;
    }

}

