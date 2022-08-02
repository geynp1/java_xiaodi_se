package net.xdclass.chapter12;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {

    public static void main(String[] args) {
        test1("src/net/xdclass/chapter12/1.txt");
    }

    public static void test1(String path) {
        BufferedReader reader = new BufferedReader(new FileReader(path))
    }
}
