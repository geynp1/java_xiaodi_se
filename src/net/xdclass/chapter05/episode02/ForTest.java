package net.xdclass.chapter05.episode02;

public class ForTest {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    public static void test3(){
        String[] array = {"dog","monkey","cat","bird","tiger","fish"};
        for (int i = 0; i < array.length; i++) {
            System.out.println("��������="+array[i]);
        }
    }

    public static void test2(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String str : array) {
            System.out.println("��������="+str);
        }
    }

    public static void test1(){
//        for (int i = 0; i < 20; i++) {
//            System.out.println("forѭ�� i="+i);
//        }
//        System.out.println("forѭ������");

//        int i = 0;
//        for (; i < 20; i++) {
//            System.out.println("forѭ�� i="+i);
//        }
//        System.out.println("forѭ������");

        int i=0;
        for(; i<20;){
            System.out.println("forѭ�� i="+i);
            i++;
        }
        System.out.println("forѭ������");
    }
}
