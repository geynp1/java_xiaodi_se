package net.xdclass.chapter05.episode05;

public class SwitchTest {
    public static void main(String[] args) {
        int day = 1;
        String content = "";
        switch(day){
            case 1: content = "��һ";
//                break;

            case 2: content = "�ܶ�";
                break;

            case 3: content = "����";
                break;

            case 4: content = "����";
                break;

            case 5: content = "����";
                break;
                
            default:
                content = "��Ч����";
        }
        System.out.println(content);
    }
}
