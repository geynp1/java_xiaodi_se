package net.xdclass.chapter06.after;

public class ExtendsMainTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("����");
        System.out.println(dog.getAge());
        dog.sleep();
        dog.eat();

        Cat cat = new Cat();
        cat.setName("����");
        System.out.println(cat.getName());
        cat.sleep();
        cat.eat();
    }
}
