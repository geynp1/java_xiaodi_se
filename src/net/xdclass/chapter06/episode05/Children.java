package net.xdclass.chapter06.episode05;

public class Children extends Father{
    public Children(){
        //Ĭ�ϴ��ڣ�д�Ͳ�д��?
//        super();
        System.out.println("Child�޲ι��캯��");
    }
    public void sleep(){
        System.out.println("����˯������");
    }

    public void test(){
//        sleep();//����ķ���
        super.sleep();
    }
}
