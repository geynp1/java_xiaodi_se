package net.xdclass.chapter06.episode07;

public interface IPay {

    // static���η����徲̬����
    static void staticMethod() {
        System.out.println("�ӿ��еľ�̬����");
    }

    // default���η�����Ĭ�Ϸ��� ,Ĭ�Ϸ������ǳ��󷽷������Բ���дҲ������д
    default void defaultMethod() {
        System.out.println("�ӿ��е�Ĭ�Ϸ���");
    }
}
