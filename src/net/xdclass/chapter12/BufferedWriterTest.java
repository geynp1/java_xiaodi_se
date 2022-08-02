package net.xdclass.chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        test1("src/net/xdclass/chapter12/8.txt");
    }

    public static void test1(String path) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        char ch ='С';
        //д��һ���ַ�
        writer.write(ch);

        String other = "�ο���xdclass.net";
        //д��һ���ַ�����
        writer.write(other.toCharArray(),0,other.length());

        writer.newLine();
        String newLine = "ѧϰjava�γ�";
        writer.write(newLine);


        writer.close();

    }
}
