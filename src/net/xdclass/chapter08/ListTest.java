package net.xdclass.chapter08;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();

        list.add("jack");
        list.add("tom");
        list.add("marry");

        String first = list.getFirst();
        String last = list.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        //更新?个元素
        list.set(0, "小滴课堂");
        System.out.println(list);
        //返回??
        int size = list.size();
        System.out.println("size="+size);
        //根据索引删除?个元素
        String indexRemove = list.remove(1);
        System.out.println("删除后的元素:"+list);
        //根据对象删除元素
        boolean flag = list.remove("jack");

        //是否为空
        boolean beforeClear = list.isEmpty();
        System.out.println("beforeClear:"+beforeClear);

        //清空元素
        list.clear();

        boolean afterClear = list.isEmpty();
        System.out.println("afterClear:"+afterClear);


    }
}
