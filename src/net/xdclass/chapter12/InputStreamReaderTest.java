package net.xdclass.chapter12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest  {
    public static void main(String[] args) throws  Exception{
        test1("src/net/xdclass/chapter12/8.txt");

    }

    public static void test1(String path) throws  Exception{
        //¶ÁÈ¡×Ö½ÚÁ÷
        InputStream in = new FileInputStream(path);

        InputStreamReader isr = new InputStreamReader(in,"GBK");

        BufferedReader reader = new BufferedReader(isr);

        String line;

        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }
        isr.close();
        reader.close();
    }
}
