package net.xdclass.chapter09;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NativeMethodTest {

    public static void main(String[] args) {
        Set<User1> userSet = new HashSet<>();
        userSet.add(new User1("jack", 22));
        userSet.add(new User1("tom", 12));
        userSet.add(new User1("tony", 22));


    }
}

class User1 {
    private int age;
    private String name;

    public User1( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);
    }

    //判断地址是否一样
    //非空判断和class类型判断
    //强转
    //对象里面的字段一一匹配
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass()!=obj.getClass()) return false;
        User1 user = (User1) obj;
        return age == user.age&& name.equals(user.name);
    }

    @Override
    public String toString() {
        return super.toString();
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
}