package net.xdclass.chapter05.episode01;

public class LoopTest {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        int i = 10;
        while (i<20) {
            System.out.println("����ѭ����ִ����i="+i);
            i++;// i=i+1;
        }

        System.out.println("ѭ������,i="+i);
    }

    public static void test2() {
        int i = 20;
        do{
            System.out.println("do while ����ѭ����ִ����i="+i);
            i++;// i=i+1;
        } while (i<20) ;

        System.out.println("do while ѭ������,i="+i);
    }
}
