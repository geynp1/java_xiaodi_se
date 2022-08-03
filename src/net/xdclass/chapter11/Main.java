package net.xdclass.chapter11;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "src/net/xdclass/chapter11/";

        String name = "a.txt";

        File file = new File(dir, name);

        InputStream inputStream = new FileInputStream(file);

//        testRead(inputStream);
//        testSkip(inputStream);
        testReadByteArr(inputStream);
    }

    public static void testRead(InputStream inputStream) throws IOException {
        //对于汉字等unicode中的字符不能正常读取，只能以乱码的形式显示
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }

    public static void testReadByteArr(InputStream inputStream) throws IOException {
        //如果buf的长度为0，则不读取任何字节并返回0；每次读取的字节数最多等于buf的长度
//        byte[] buf = new byte[1024];
        byte[] buf = new byte[inputStream.available()];

        int length;

        // 循环读取文件内容，输入流中将最多的buf,
        // length个字节数据读入一个buf数组，返回类型是读取到的字节数
        //如果这个缓冲区没有满的话，则返回真实的字节数
        while ( (length = inputStream.read(buf))!=-1) {
            // 中文乱码问题，换成GBK，或UTF-8
//            System.out.print(new String(buf,0,length));
//            System.out.print(new String(buf,0,length,"GBK"));
            System.out.println(new String(buf,0,length));
        }

    }

    public static void testSkip(InputStream inputStream) throws IOException {
        long skipSize = inputStream.skip(2);
        System.out.println(skipSize);

        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }
}
