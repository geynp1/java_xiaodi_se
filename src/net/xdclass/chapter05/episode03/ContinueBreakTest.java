package net.xdclass.chapter05.episode03;

public class ContinueBreakTest {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test2(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String animal : array) {
            //�ַ����Ƚ��Ƿ���ȣ�������==��Ӧ��ʹ��equals����
            if ("cat".equals(animal)) {
                System.out.println("����cat��");
                continue;
            }
            System.out.println("��������="+animal);
        }
        System.out.println("ѭ������");
    }
    public static void test1(){
        String[] array = {"dog","monkey","cat","bird","tiger"};
        for (String animal : array) {
            System.out.println("��������="+animal);
            //�ַ����Ƚ��Ƿ���ȣ�������==��Ӧ��ʹ��equals����
            if ("cat".equals(animal)) {
                System.out.println("����cat��");
                break;
            }
        }
        System.out.println("ѭ������");
    }
}
