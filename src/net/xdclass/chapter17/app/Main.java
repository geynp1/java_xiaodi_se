package net.xdclass.chapter17.app;

import net.xdclass.chapter17.model.Response;
import net.xdclass.chapter17.service.QkyRobotServiceImpl;
import net.xdclass.chapter17.service.RobotService;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private static final RobotService robotService = new QkyRobotServiceImpl();
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�ϰ壬�鷳������ȡһ�����������֣����س���ȷ��!");
        String name = scanner.nextLine();
        System.out.println("hi,��������С����"+name+",ֱ�Ӷ����´�ָ��");
        while (true){
            String input = scanner.nextLine();
            if ("886".equalsIgnoreCase(input)) {
                System.out.println("��ӭ�´�ʹ�ã��ݰ�");
                break;
            }else {
                Response response = robotService.qa(input);

                if(response!=null && response.getCode()==0){
                    System.out.println(name+":"+new String(response.getContent().getBytes(),"UTF-8"));
                }else{
                    System.out.println(name+":��ʱû����������˼�����¸����Ұ�");
                }
            }
        }
        scanner.close();
    }
}
