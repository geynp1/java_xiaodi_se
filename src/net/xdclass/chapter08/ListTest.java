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
        //����?��Ԫ��
        list.set(0, "С�ο���");
        System.out.println(list);
        //����??
        int size = list.size();
        System.out.println("size="+size);
        //��������ɾ��?��Ԫ��
        String indexRemove = list.remove(1);
        System.out.println("ɾ�����Ԫ��:"+list);
        //���ݶ���ɾ��Ԫ��
        boolean flag = list.remove("jack");

        //�Ƿ�Ϊ��
        boolean beforeClear = list.isEmpty();
        System.out.println("beforeClear:"+beforeClear);

        //���Ԫ��
        list.clear();

        boolean afterClear = list.isEmpty();
        System.out.println("afterClear:"+afterClear);


    }
}
