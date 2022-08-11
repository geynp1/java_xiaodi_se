package net.xdclass.chapter08;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>(); //����
//        TreeMap<String, String> map = new TreeMap<>(); //����-����ABCD����
        LinkedHashMap<String, String> map = new LinkedHashMap<>(); //����-���շ���˳������

        //��map??��key - value;
        map.put("BС��","�㶫����");
        map.put("CС��","�㶫����");
        map.put("D����","�㶫����");
        map.put("A����","�㶫����");

        System.out.println(map);
        System.out.println("------------------------------------");
        //����key��ȡvalue
        String getValue = map.get("CС��");
        System.out.println("getvalue= "+getValue);

        //�ж��Ƿ����ĳ��key
        boolean isContains = map.containsKey("С��");
        System.out.println("containsKey="+isContains);
        //����map��Ԫ������
        int size = map.size();
        System.out.println("size="+size);

        //��ȡ����value����
        Collection<String> collection = map.values();
        System.out.println(collection);


        //��������key�ļ���
        Set<String> set =  map.keySet();
        System.out.println("set = " + set);

        //����?��Set���ϣ����ϵ�����ΪMap.Entry , ��Map������?���ڲ���?����?Ϊ���ͣ�����ΪEntry<K,V>��
        //����ʾMap�е�?��ʵ��(?��key-value��),��Ҫ��getKey(),getValue?��
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("key=" + entry.getKey()+", value="+entry.getValue());
        }

        //�ж�map�Ƿ�Ϊ��
        boolean beforeClear = map.isEmpty();
        System.out.println("beforeClear="+beforeClear);

        //�������
        map.clear();

        //�ж�map�Ƿ�Ϊ��
        boolean AfterClear = map.isEmpty();
        System.out.println("AfterClear="+AfterClear);
    }
}
