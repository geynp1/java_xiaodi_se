package net.xdclass.chapter11;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        String dir = "src/net/xdclass/chapter11/";

        String name = "a.txt";

        String target = "b.txt";

        File file = new File(dir, name);

        InputStream inputStream = new FileInputStream(file);

        //会自动创建文件，但是不会创建多级目录下的文件
        //OutputStream outputStream = new FileOutputStream(dir + File.separator + target);

        //不覆盖数据，追加数据
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
        //关闭
        inputStream.close();
        outputStream.close();
    }




        //单个字节读取，中文会有问题,性能差，效果不好
    public static void testOut(InputStream inputStream,OutputStream outputStream) throws IOException {
        int value = 0;
        while (value != -1) {
            value = inputStream.read();
            outputStream.write(value);
        }
        //最后急得关闭流
        inputStream.close();
        outputStream.close();
    }

}
