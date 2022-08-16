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
            System.out.println("动物类型="+array[i]);
        }
    }

    public static void test2(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String str : array) {
            System.out.println("动物类型="+str);
        }
    }

    public static void test1(){
//        for (int i = 0; i < 20; i++) {
//            System.out.println("for循环 i="+i);
//        }
//        System.out.println("for循环结束");

//        int i = 0;
//        for (; i < 20; i++) {
//            System.out.println("for循环 i="+i);
//        }
//        System.out.println("for循环结束");

        int i=0;
        for(; i<20;){
            System.out.println("for循环 i="+i);
            i++;
        }
        System.out.println("for循环结束");
    }
}
