package net.xdclass.chapter05.episode08;

import java.util.Arrays;

public class AnswerTest {
    public static void main(String[] args) {

        test3();

    }

    public static void test3(){
        Dog[] dogs = new Dog[5];

        for (int i = 0; i < 5; i++) {
            Dog dog = new Dog();
            dog.setName("Íú²Æ"+i);
            dogs[i] = dog;

        }

        Dog dog = dogs[3];
        dog.changeAge();
        dog.changeAge();

        for (Dog d : dogs) {
            System.out.println("Ãû³Æ"+d.getName()+",age="+d.getAge());

        }
    }

    public static void test2(){
        int season = 10;
        String content;

        switch (season) {
            case 1: content = "´º";
                break;

            case 2: content = "ÏÄ";
                break;

            case 3: content = "Çï";
                break;

            case 4: content = "¶¬";
                break;

            default:{
                content = "´íÎó¼¾½Ú";
                System.out.println("default Ö´ÐÐ");
            }
        }
        System.out.println(content);
    }

    public static void test1(){
        Student[] arr1 = new Student[60];
        int arr1Index = 0;

        Student[] arr2 = new Student[40];
        int arr2Index = 0;

        for (int i = 0; i < 100; i++) {
            int num = i+1;
            Student student = new Student();
            student.setId(num);
            if (num > 60) {
                arr2[arr2Index] = student;
                arr2Index++;
            }else {
                arr1[arr1Index] = student;
                arr1Index++;
            }

        }

        for (Student s : arr1) {
            System.out.println(s.getId());
        }
        System.out.println("===========");
        for (Student s : arr2) {
            System.out.println(s.getId());
        }
    }
}
