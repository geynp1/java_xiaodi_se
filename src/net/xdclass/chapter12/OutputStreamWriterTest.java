package net.xdclass.chapter12;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws Exception {
        test1("src/net/xdclass/chapter12/9.txt");

    }

    public static void test1(String path) throws Exception{
        OutputStream out = new FileOutputStream(path);

        OutputStreamWriter osr = new OutputStreamWriter(out,"UTF-8");

        BufferedWriter bufw = new BufferedWriter(osr);

        String str = "��ӭ����С�ο���xdclass.net";

        bufw.write(str);
        bufw.newLine();
        bufw.write("ѧϰjava�γ�");
        bufw.flush();
        bufw.close();

    }
}

