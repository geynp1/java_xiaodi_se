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

        //?件的 查询和判断
        System.out.println(File.separator);
        System.out.println("基本路径 getPath()= " + file.getPath());
        System.out.println("?件名 getName()= " + file.getName());
        System.out.println("绝对路径 getAbsolutePath = " +file.getAbsolutePath());
        System.out.println("?路径名 getParent() = " + file.getParent());
        System.out.println("是否是绝对路径 isAbsolute() = " +file.isAbsolute());
        System.out.println("是否是?个?录 isDirectory() = " +file.isDirectory());
        System.out.println("是否是?个?件 isFile() = " + file.isFile());
        System.out.println("?件或?录是否存在 exists() = " +file.exists());
        System.out.println("?录中的?件和?录的名称所组成字符串数组 list() ");

        String[] arr = file.list();
        for (String temp : arr) {
            System.out.println(temp);
        }

        //创建指定目录
        File mkdir = new File(dir + "\\xd");
        mkdir.mkdir();

        //创建多级目录
        File mkdirs = new File(dir + "\\xd\\aa\\cc");
        mkdirs.mkdirs();

        //创建一个文件
        File newFile = new File(dir+"\\xxxx.txt");

//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        newFile.delete();
    }



}
