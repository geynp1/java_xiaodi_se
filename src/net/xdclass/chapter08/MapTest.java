package net.xdclass.chapter08;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>(); //无序
//        TreeMap<String, String> map = new TreeMap<>(); //有序-按照ABCD排序
        LinkedHashMap<String, String> map = new LinkedHashMap<>(); //有序-按照放入顺序排序

        //往map??放key - value;
        map.put("B小明","广东广州");
        map.put("C小东","广东深圳");
        map.put("D阿北","广东深圳");
        map.put("A阿西","广东深圳");

        System.out.println(map);
        System.out.println("------------------------------------");
        //根据key获取value
        String getValue = map.get("C小东");
        System.out.println("getvalue= "+getValue);

        //判断是否包含某个key
        boolean isContains = map.containsKey("小明");
        System.out.println("containsKey="+isContains);
        //返回map的元素数量
        int size = map.size();
        System.out.println("size="+size);

        //获取所有value集合
        Collection<String> collection = map.values();
        System.out.println(collection);


        //返回所有key的集合
        Set<String> set =  map.keySet();
        System.out.println("set = " + set);

        //返回?个Set集合，集合的类型为Map.Entry , 是Map声明的?个内部接?，接?为泛型，定义为Entry<K,V>，
        //它表示Map中的?个实体(?个key-value对),主要有getKey(),getValue?法
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("key=" + entry.getKey()+", value="+entry.getValue());
        }

        //判断map是否为空
        boolean beforeClear = map.isEmpty();
        System.out.println("beforeClear="+beforeClear);

        //清空容器
        map.clear();

        //判断map是否为空
        boolean AfterClear = map.isEmpty();
        System.out.println("AfterClear="+AfterClear);
    }
}
