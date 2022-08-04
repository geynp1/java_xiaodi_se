package net.xdclass.chapter11;

import java.io.*;

public class PracticeTest {
    public static void main(String[] args) throws IOException {
        File sFile = new File("src/net/xdclass/chapter11/copySource");
        File tFile = new File("src/net/xdclass/chapter11/copyTarget");
        copy(sFile,tFile);
    }

    public static void copy(File sFile, File tFile) throws IOException {
        System.out.println(sFile.listFiles());
        for (File file : sFile.listFiles()) {
            System.out.println(file.getName());

            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(tFile+File.separator+file.getName());
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int size;
            byte[] buf = new byte[1024];
            while ((size = fis.read(buf))!=-1){
                bos.write(buf,0,size);
            }

            bos.close();
            fis.close();
            fos.close();

        }
    }


}
