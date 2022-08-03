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
        //���ں��ֵ�unicode�е��ַ�����������ȡ��ֻ�����������ʽ��ʾ
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }

    public static void testReadByteArr(InputStream inputStream) throws IOException {
        //���buf�ĳ���Ϊ0���򲻶�ȡ�κ��ֽڲ�����0��ÿ�ζ�ȡ���ֽ���������buf�ĳ���
//        byte[] buf = new byte[1024];
        byte[] buf = new byte[inputStream.available()];

        int length;

        // ѭ����ȡ�ļ����ݣ��������н�����buf,
        // length���ֽ����ݶ���һ��buf���飬���������Ƕ�ȡ�����ֽ���
        //������������û�����Ļ����򷵻���ʵ���ֽ���
        while ( (length = inputStream.read(buf))!=-1) {
            // �����������⣬����GBK����UTF-8
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
