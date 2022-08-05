package net.xdclass.chapter09;

import java.util.*;

public class UnModifyTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SpringBoot课程");
        list.add("机构课程");
        list.add("微服务SpringCloud课程");

        list = Collections.unmodifiableList(list);
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("Mysql教程");
        set.add("Linux教程");
        set.add("Git教程");
        //设置为只读set
        set = Collections.unmodifiableSet(set);
        System.out.println(set);

        Map<String, String> map = new HashMap<>();
        map.put("key1", "课程1");
        map.put("key2", "课程2");
        map = Collections.unmodifiableMap(map);
        System.out.println(map);
    }
}
