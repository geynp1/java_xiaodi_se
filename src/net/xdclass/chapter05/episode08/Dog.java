package net.xdclass.chapter05.episode08;

public class Dog {
    public static int age = 10;
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void changeAge(){
        age++;
    }

    public int getAge(){
        return age;
    }
}
