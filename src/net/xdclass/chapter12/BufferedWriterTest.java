package net.xdclass.chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        test1("src/net/xdclass/chapter12/8.txt");
    }

    public static void test1(String path) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        char ch ='小';
        //写入一个字符
        writer.write(ch);

        String other = "滴课堂xdclass.net";
        //写入一个字符数组
        writer.write(other.toCharArray(),0,other.length());

        writer.newLine();
        String newLine = "学习java课程";
        writer.write(newLine);


        writer.close();

    }
}
