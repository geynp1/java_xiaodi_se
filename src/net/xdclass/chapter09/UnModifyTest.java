package net.xdclass.chapter09;

import java.util.*;

public class UnModifyTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SpringBoot�γ�");
        list.add("�����γ�");
        list.add("΢����SpringCloud�γ�");

        list = Collections.unmodifiableList(list);
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("Mysql�̳�");
        set.add("Linux�̳�");
        set.add("Git�̳�");
        //����Ϊֻ��set
        set = Collections.unmodifiableSet(set);
        System.out.println(set);

        Map<String, String> map = new HashMap<>();
        map.put("key1", "�γ�1");
        map.put("key2", "�γ�2");
        map = Collections.unmodifiableMap(map);
        System.out.println(map);
    }
}
