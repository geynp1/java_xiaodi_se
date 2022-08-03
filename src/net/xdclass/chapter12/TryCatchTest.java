package net.xdclass.chapter12;

import java.io.*;

public class TryCatchTest {
    public static void main(String[] args) {
        test1();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            FileInputStream fis = new FileInputStream("src/net/xdclass/chapter12/1.txt");
            bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("src/net/xdclass/chapter12/11.txt");
            bos = new BufferedOutputStream(fos);

            int size;

            byte[] buf = new byte[1024];

            while ((size = bis.read(buf))!=-1){
                bos.write(buf,0,size);
            }
        }catch (Exception e){

        }finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(bos!=null){
                        try {
                            bos.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void test1(){
        try (
                FileInputStream fis = new FileInputStream("src/net/xdclass/chapter12/1.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("src/net/xdclass/chapter12/22.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ) {
            int size;

            byte[] buf = new byte[1024];

            while ((size = bis.read(buf))!=-1){
                bos.write(buf,0,size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
