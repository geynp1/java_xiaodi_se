package net.xdclass.chapter12;

import java.io.*;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
//        test1();
        test2();
    }

    public static void test1() throws IOException {
        String dir = "src/net/xdclass/chapter12/1.txt";

        File file = new File(dir);

        Reader input = new FileReader(file);

        int ch;

        while ((ch = input.read())!=-1){
            System.out.print((char)ch);
        }
        input.close();
    }

    public static void test2() throws IOException {
        String dir = "src/net/xdclass/chapter12/1.txt";

        File file = new File(dir);

        Reader input = new FileReader(file);

        char c[] = new char[1024];//一次性读取
        int len = input.read(c);

        input.close();
        System.out.println("内容为:"+new String(c,0,len));
    }
}
