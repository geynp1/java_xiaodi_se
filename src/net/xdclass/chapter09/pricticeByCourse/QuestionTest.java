package net.xdclass.chapter09.pricticeByCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QuestionTest {

    public static void main(String[] args) {
        testCounter();
    }

    public static void testCounter(){
        String str = "*Constructs a new <tt>HashMap</tt> ?滴课堂 with the same " +
                "mappings as the * ?滴课堂 specified <tt>Map</tt>. " +
                "The <tt>HashMap</tt> is created with default load factor " +
                "(0.75) and an initial capacity sufficient to*hold the " +
                "mappings in the specified <tt>Map</tt>.";
        //把字符串转为数组
        char[] charArr = str.toCharArray();
        //创建一个map
        Map<Character, Integer> counterMap = new HashMap<>();
        //遍历数组，得到每个字符
        for (int i = 0; i < charArr.length; i++) {
            //拿到字符作为键key去集合中查找
            Integer value = counterMap.get(charArr[i]);
            if (value == null) {
                //把字符作为键，1为值存储到集合
                counterMap.put(charArr[i], 1);
            }else{
                //把值加1重新写入集合
                value +=1;
                counterMap.put(charArr[i], value);
            }


        }
        //遍历输出
        Set<Map.Entry<Character,Integer>> entrySet =  counterMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"字符出现的次数="+entry.getValue());
        }

    }
}
