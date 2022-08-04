package net.xdclass.chapter11;

import java.io.*;

public class BufferMain {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/net/xdclass/chapter11/xdclass.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("src/net/xdclass/chapter11/copy.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int size;
            byte[] buf = new byte[1024];

            while ( (size = bis.read(buf))!=-1){
                bos.write(buf, 0, size);
            }
            //刷新磁盘缓冲区输出流，才可以保证数据全部输出完成。
            //bos.flush();
            //BufferedInputStream和BufferedOutputStream会自动关闭上层流
            bis.close();
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
