package net.xdclass.chapter06;

/**
 * 6-2
 * 一个类可以有多个构造函数
 */
public class User {

    private int age;
    private String name;
    //构造函数，相当于这个类的初始化
    //如果构造函数相互调用，务必写在方法第一行
    public User(){
        System.out.println("这是默认构造函数");
        this.age=120;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
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

    public void sleep(){
        System.out.println("睡觉1");
        String name = this.name;
        System.out.println(name+"在睡觉");

    }

    public void sleep(String address){
        System.out.println(address);
        System.out.println("睡觉1");
    }


}
