package net.xdclass.chapter06.episode05.orderTest;

public class Father {

    static {
        System.out.println("���ྲ̬�����");
    }

    public Father(){
        System.out.println("father �޲ι��캯��");
    }

    public Father(int age){
        System.out.println("father �вι��캯��");
    }

    public void sleep(){
        System.out.println("father sleep����");
    }

    public static void main(String[] args) {
        new Children().sleep();
    }

}

 class Children extends Father{

    static {
        System.out.println("Child��̬�����");
    }
    public Children(){
        //super();
        System.out.println("Child�޲ι��캯��");
        super.sleep();
    }
    public void sleep(){
        System.out.println("Child sleep����");
    }
}


