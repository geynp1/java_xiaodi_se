package net.xdclass.chapter04.episode06;

import java.util.Arrays;

public class HeapStackTest {

    public static void main(String[] args) {
        //        int age = 10;
//        int age2 = 20;
//
//        System.out.println(age2);
//        System.out.println(age);
//
//        age2 = age;
//        age = 2;
//
//        System.out.println(age2);
//        System.out.println(age);




//
//        String a = "СD����ѧϰjava�ܹ��γ�";
//        String b = "l love java";
//        System.out.println(a);
//        System.out.println(b);
//
//        b = a ;
//        System.out.println(a);
//        System.out.println(b);
//
//        a = "СD����ѧϰjava�ܹ��γ̣�������ѧjava����";
//
//        System.out.println(a);
//        System.out.println(b);






        int [] a = {1,2,3};
        int [] b = a;
        int [] c = a;
//        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[0] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
