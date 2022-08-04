package net.xdclass.chapter11;

import java.io.*;

public class CopyMain {

    public static void main(String[] args) {
        String dir = "src/net/xdclass/chapter11/test";
        File file = new File(dir + "/img1");
        File[] files = file.listFiles();

        for (File from : files) {
            String fileName = from.getName();
            copy(from.getAbsolutePath(),dir+"/img2/"+fileName);

        }
    }

    public static void copy(String from, String to) {
        try {
            File targetDir = new File( new File(to).getParent());
            if(!targetDir.exists()){
                targetDir.mkdir();
            }
            FileInputStream fis = new FileInputStream(from);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(to);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int size;
            byte[] buf = new byte[1024];
            while ((size = bis.read(buf))!=-1){
                bos.write(buf,0,size);
            }
            //ˢ�´˻����������ſ��Ա�֤���ݵ�ȫ�����
            //bos.flush();

            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
