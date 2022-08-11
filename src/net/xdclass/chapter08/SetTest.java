package net.xdclass.chapter08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(); //无序，底层hashmap
        TreeSet<String> set = new TreeSet<>(); //排序，底层treemap


        //往容器??添加对象
        set.add("jack");
        set.add("jack");
        set.add("tom");
        set.add("marry");

        System.out.println(set);
        System.out.println("=======================");
        //返回??
        int size = set.size();
        System.out.println("size = " + size);
        //根据对象删除元素
        set.remove("jack");
        System.out.println("删除jack之后 = "+ set);
        //是否为空
        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);

        //清空元素
        set.clear();
    }
}
