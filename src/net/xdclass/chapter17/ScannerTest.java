package net.xdclass.chapter17;

import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("�������ַ���");
            String input = scanner.nextLine();
            if("886".equalsIgnoreCase(input)){
                System.out.println("��ӭ�´�ʹ�ã��ݰ�");
                break;
            }else{
                System.out.println("���������:"+input);
            }
        }
        scanner.close();
    }
}
