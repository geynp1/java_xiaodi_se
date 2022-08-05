package net.xdclass.chapter09;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {
//        testSet();
//        testTreeSet();
//        testList();
//        testMap();
//        testSort();
        testShuffle();
    }

    public static void testShuffle(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("J");
        list.add("Q");
        list.add("K");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void testSort(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("zzz");
        list.add("ggg");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //默认是升序排序
        Collections.sort(list,Comparator.naturalOrder());
        System.out.println(list);

        //默认是降序排序
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }




    public static void testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("jack", "广东");
        map.put("tim", "广西");
        map.put("marry", "海南");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> iterator= entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            String str = entry.getKey()+"="+ entry.getValue();
            System.out.println(str);
        }
    }

    public static void testList(){
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tony");
        list.add("eric");
        list.add("jack");
        Iterator<String> iterator = list.iterator();
        System.out.println(list);
        while (iterator.hasNext()) {
            String str = iterator.next();
            //并发修改异常
//            if (str.equals("jack")) {
//                list.remove(str);
//                break;//正常执行要马上跳出循环
//            }
            if (str.equals("jack")) { //并发修改异常
                iterator.remove();
            }

        }
        System.out.println(list);
    }

    public static void testSet(){
        Set<String> set = new HashSet<>();
        set.add("jack");
        set.add("tom");
        set.add("marry");
        set.add("tony");
        set.add("jack");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    public static void testTreeSet(){
        Set<String> set = new TreeSet<>();
        set.add("jack");
        set.add("tom");
        set.add("marry");
        set.add("tony");
        set.add("jack");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
