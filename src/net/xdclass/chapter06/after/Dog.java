package net.xdclass.chapter06.after;

public class Dog extends Animal{
    public void eat(){
        System.out.println("���Թ�ͷ");
    }
    @Override
    public void sleep() {
        System.out.println("����������۾�˯��");
    }

    public void test(){
        super.sleep(); //���ø��෽��,super��ʾ���������
        //��Ŷ���õ�ǰ��ķ�����this��ʾ��ǰ���������
        this.sleep();
    }
}
