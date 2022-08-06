package net.xdclass.chapter09.practiceByMe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringTest {

    public static void main(String[] args) {
        String str = "*Constructs a new <tt>HashMap</tt> ?µÎ¿ÎÌÃ with the same mappings as the * ?µÎ¿ÎÌÃ specified <tt>Map</tt>. The <tt>HashMap</tt> is created with default load factor (0.75) and an initial capacity sufficient to*hold the mappings in the specified <tt>Map</tt>.";

        char[] strChar = str.toCharArray();

        Set<String> set = new HashSet<>();
        for (char s : strChar) {
            set.add(String.valueOf(s));
        }
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (String s : set) {
            int count = 0;
            for (char  c: strChar) {
                if(s.equals(String.valueOf(c))){
                    count++;
                }
            }
            map.put(s, count);
        }
        System.out.println(map);
    }
}
