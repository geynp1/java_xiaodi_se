package net.xdclass.chapter05.episode05;

public class SwitchTest {
    public static void main(String[] args) {
        int day = 1;
        String content = "";
        switch(day){
            case 1: content = "周一";
//                break;

            case 2: content = "周二";
                break;

            case 3: content = "周三";
                break;

            case 4: content = "周四";
                break;

            case 5: content = "周五";
                break;
                
            default:
                content = "无效数字";
        }
        System.out.println(content);
    }
}
