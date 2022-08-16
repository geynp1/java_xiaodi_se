package net.xdclass.chapter05.episode03;

public class ContinueBreakTest {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test2(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String animal : array) {
            //字符串比较是否相等，不能勇==，应该使用equals方法
            if ("cat".equals(animal)) {
                System.out.println("发现cat了");
                continue;
            }
            System.out.println("动物类型="+animal);
        }
        System.out.println("循环结束");
    }
    public static void test1(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String animal : array) {
            System.out.println("动物类型="+animal);
            //字符串比较是否相等，不能勇==，应该使用equals方法
            if ("cat".equals(animal)) {
                System.out.println("发现cat了");
                break;
            }
        }
        System.out.println("循环结束");
    }
}
