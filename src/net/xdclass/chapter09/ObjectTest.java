package net.xdclass.chapter09;

import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args) {
        String str1 = "javase xdclass";
        String str2 = "javase xdclass";
        System.out.println(Objects.equals(str1,str2));

        String[] arr1 = {"aa", "bb", "cc"};
        String[] arr2 = {"aa", "bb", "cc"};
        System.out.println(Objects.equals(arr1,arr2));//两个内存地址不一样
        System.out.println(Objects.deepEquals(arr1,arr2));

        System.out.println(Objects.hashCode("xdclass.net"));
        System.out.println(Objects.hashCode("xdclass.net."));
        System.out.println(Objects.hashCode("xdclassnet"));

        System.out.println(Objects.hash("xdclass",12,33L));
    }
}
