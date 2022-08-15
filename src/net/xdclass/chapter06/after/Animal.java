package net.xdclass.chapter06.after;

/**
 * 6-4
 */
public class Animal extends Living {

    protected String name;
    protected int age;

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

    public void sleep(){
        System.out.println("±Õ×ÅÑÛ¾¦Ë¯¾õ");
    }
}
