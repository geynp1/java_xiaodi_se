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
        System.out.println("老板，麻烦您给我取一个响亮的名字，按回车键确定!");
        String name = scanner.nextLine();
        System.out.println("hi,我是您的小助手"+name+",直接对我下达指令");
        while (true){
            String input = scanner.nextLine();
            if ("886".equalsIgnoreCase(input)) {
                System.out.println("欢迎下次使用，拜拜");
                break;
            }else {
                Response response = robotService.qa(input);

                if(response!=null && response.getCode()==0){
                    System.out.println(name+":"+new String(response.getContent().getBytes(),"UTF-8"));
                }else{
                    System.out.println(name+":暂时没明白您的意思，重新告诉我吧");
                }
            }
        }
        scanner.close();
    }
}
