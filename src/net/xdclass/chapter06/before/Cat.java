package net.xdclass.chapter06.before;

/**
 * 6-4
 */
public class Cat {
    private String name;
    private int age;

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

    public void eat(){
        System.out.println("Ã¨³ÔÓã");
    }
}
