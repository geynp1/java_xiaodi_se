package net.xdclass.chapter13;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("今天日期:"+today);
        //获取年，月，日
        System.out.println("现在是那年:"+today.getYear());
        System.out.println("现在是那月:"+today.getMonth());
        System.out.println("现在是那月(数字):"+today.getMonthValue());
        System.out.println("现在是几号:"+today.getDayOfMonth());
        System.out.println("现在是周几:"+today.getDayOfWeek());

        //加减年份，加后返回的对象才是修改后，旧的依旧是旧的
        LocalDate changeDate = today.plusYears(1);
        System.out.println("加后是哪年:"+changeDate.getYear());
        System.out.println("旧的是哪年:"+today.getYear());

        //日期比较
        System.out.println("isAfter:"+changeDate.isAfter(today));
    }
}
