package net.xdclass.chapter08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(); //���򣬵ײ�hashmap
        TreeSet<String> set = new TreeSet<>(); //���򣬵ײ�treemap


        //������??��Ӷ���
        set.add("jack");
        set.add("jack");
        set.add("tom");
        set.add("marry");

        System.out.println(set);
        System.out.println("=======================");
        //����??
        int size = set.size();
        System.out.println("size = " + size);
        //���ݶ���ɾ��Ԫ��
        set.remove("jack");
        System.out.println("ɾ��jack֮�� = "+ set);
        //�Ƿ�Ϊ��
        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);

        //���Ԫ��
        set.clear();
    }
}
