package net.xdclass.chapter11;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        String dir = "src/net/xdclass/chapter11/";

        String name = "a.txt";

        String target = "b.txt";

        File file = new File(dir, name);

        InputStream inputStream = new FileInputStream(file);

        //���Զ������ļ������ǲ��ᴴ���༶Ŀ¼�µ��ļ�
        //OutputStream outputStream = new FileOutputStream(dir + File.separator + target);

        //���������ݣ�׷������
        OutputStream outputStream = new FileOutputStream(dir + File.separator + target,true);

//        testOut(inputStream, outputStream);
        testOutBuf(inputStream, outputStream);
    }

    public static void testOutBuf (InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buf = new byte[1024];
        int length;
        while ((length = inputStream.read(buf))!=-1){
            outputStream.write(buf,0,length);
        }
        //�ر�
        inputStream.close();
        outputStream.close();
    }




        //�����ֽڶ�ȡ�����Ļ�������,���ܲЧ������
    public static void testOut(InputStream inputStream,OutputStream outputStream) throws IOException {
        int value = 0;
        while (value != -1) {
            value = inputStream.read();
            outputStream.write(value);
        }
        //��󼱵ùر���
        inputStream.close();
        outputStream.close();
    }

}
