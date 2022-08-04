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
            //ˢ�´��̻�������������ſ��Ա�֤����ȫ�������ɡ�
            //bos.flush();
            //BufferedInputStream��BufferedOutputStream���Զ��ر��ϲ���
            bis.close();
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
