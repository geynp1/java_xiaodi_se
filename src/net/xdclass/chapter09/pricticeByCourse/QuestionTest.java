package net.xdclass.chapter09.pricticeByCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QuestionTest {

    public static void main(String[] args) {
        testCounter();
    }

    public static void testCounter(){
        String str = "*Constructs a new <tt>HashMap</tt> ?�ο��� with the same " +
                "mappings as the * ?�ο��� specified <tt>Map</tt>. " +
                "The <tt>HashMap</tt> is created with default load factor " +
                "(0.75) and an initial capacity sufficient to*hold the " +
                "mappings in the specified <tt>Map</tt>.";
        //���ַ���תΪ����
        char[] charArr = str.toCharArray();
        //����һ��map
        Map<Character, Integer> counterMap = new HashMap<>();
        //�������飬�õ�ÿ���ַ�
        for (int i = 0; i < charArr.length; i++) {
            //�õ��ַ���Ϊ��keyȥ�����в���
            Integer value = counterMap.get(charArr[i]);
            if (value == null) {
                //���ַ���Ϊ����1Ϊֵ�洢������
                counterMap.put(charArr[i], 1);
            }else{
                //��ֵ��1����д�뼯��
                value +=1;
                counterMap.put(charArr[i], value);
            }


        }
        //�������
        Set<Map.Entry<Character,Integer>> entrySet =  counterMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"�ַ����ֵĴ���="+entry.getValue());
        }

    }
}
