package net.xdclass.chapter07;

/**
 * 调用自定义异常类
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            test();
        } catch (UserNotEnoughException e) {
            int code = e.getCode();
            String msg = e.getmsg();
            e.printStackTrace();
            System.out.println("code="+code+","+"msg="+msg);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws UserNotEnoughException{
        throw new UserNotEnoughException(-1,"人员不够异常");
    }
}
