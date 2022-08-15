package net.xdclass.chapter06.episode05;

public class Children extends Father{
    public Children(){
        //默认存在，写和不写都?
//        super();
        System.out.println("Child无参构造函数");
    }
    public void sleep(){
        System.out.println("子类睡觉方法");
    }

    public void test(){
//        sleep();//子类的方法
        super.sleep();
    }
}
