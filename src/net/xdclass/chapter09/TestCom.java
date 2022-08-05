package net.xdclass.chapter09;

import java.util.*;

public class TestCom {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>();
        userSet.add(new User("jack",32));
        userSet.add(new User("tom",22));
        userSet.add(new User("mary",35));
        userSet.add(new User("tim",11));
        userSet.add(new User("tony",49));
        userSet.add(new User("dd",30));
        System.out.println(userSet);

        List<User> userList = new ArrayList<>();
        userList.add(new User("jack",32));
        userList.add(new User("tom",22));
        userList.add(new User("mary",35));
        userList.add(new User("tim",11));
        userList.add(new User("tony",49));
        userList.add(new User("dd",30));
        System.out.println(userList);
        Collections.sort(userList);
        System.out.println(userList);
    }
}
class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        return this.age-user.age;
    }
}