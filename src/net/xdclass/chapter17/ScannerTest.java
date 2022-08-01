package net.xdclass.chapter17;

import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入字符串");
            String input = scanner.nextLine();
            if("886".equalsIgnoreCase(input)){
                System.out.println("欢迎下次使用，拜拜");
                break;
            }else{
                System.out.println("您输入的是:"+input);
            }
        }
        scanner.close();
    }
}
