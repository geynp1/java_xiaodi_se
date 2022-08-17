package net.xdclass.chapter04.episode03;

public class Student {
    public void learn(){
        System.out.println("СD");
        Dog dog = new Dog();
        dog.wangwang();

        Cat cat = new Cat();
        cat.miao();
    }
}

class Dog{
    public void wangwang(){
        System.out.println("wangwang");
    }
}

class Cat{
    public void miao(){
        System.out.println("miao");
    }
}

