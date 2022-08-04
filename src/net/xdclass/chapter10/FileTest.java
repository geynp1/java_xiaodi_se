package net.xdclass.chapter10;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        String dir ="src/net/xdclass/chapter10";

        String name = "a.txt";

//        File file = new File(dir,name);
        File file = new File(dir);

        System.out.println(file.getPath());

        //?���� ��ѯ���ж�
        System.out.println(File.separator);
        System.out.println("����·�� getPath()= " + file.getPath());
        System.out.println("?���� getName()= " + file.getName());
        System.out.println("����·�� getAbsolutePath = " +file.getAbsolutePath());
        System.out.println("?·���� getParent() = " + file.getParent());
        System.out.println("�Ƿ��Ǿ���·�� isAbsolute() = " +file.isAbsolute());
        System.out.println("�Ƿ���?��?¼ isDirectory() = " +file.isDirectory());
        System.out.println("�Ƿ���?��?�� isFile() = " + file.isFile());
        System.out.println("?����?¼�Ƿ���� exists() = " +file.exists());
        System.out.println("?¼�е�?����?¼������������ַ������� list() ");

        String[] arr = file.list();
        for (String temp : arr) {
            System.out.println(temp);
        }

        //����ָ��Ŀ¼
        File mkdir = new File(dir + "\\xd");
        mkdir.mkdir();

        //�����༶Ŀ¼
        File mkdirs = new File(dir + "\\xd\\aa\\cc");
        mkdirs.mkdirs();

        //����һ���ļ�
        File newFile = new File(dir+"\\xxxx.txt");

//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        newFile.delete();
    }



}
