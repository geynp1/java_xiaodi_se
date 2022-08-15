package net.xdclass.chapter06.episode05.orderTest;

public class Father {

    static {
        System.out.println("父类静态代码块");
    }

    public Father(){
        System.out.println("father 无参构造函数");
    }

    public Father(int age){
        System.out.println("father 有参构造函数");
    }

    public void sleep(){
        System.out.println("father sleep方法");
    }

    public static void main(String[] args) {
        new Children().sleep();
    }

}

 class Children extends Father{

    static {
        System.out.println("Child静态代码块");
    }
    public Children(){
        //super();
        System.out.println("Child无参构造函数");
        super.sleep();
    }
    public void sleep(){
        System.out.println("Child sleep方法");
    }
}


