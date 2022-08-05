package net.xdclass.chapter10;

import java.io.File;
import java.io.IOException;

public class PricticeTest {

    public static void main(String[] args) throws IOException {
        String path = "src/net/xdclass/chapter10";
        File test = new File(path + File.separator+"test");
        test.mkdir();
        System.out.println(test.getAbsolutePath());
        for (int i = 1; i < 11; i++) {
            path = test.getAbsolutePath()+File.separator+i;
            File newFile = new File(path);
            newFile.mkdir();
            File newFile1 = new File(path + File.separator + i + ".txt");
            newFile1.createNewFile();
        }
    }


}
