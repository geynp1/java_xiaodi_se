package net.xdclass.chapter13;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("��������:"+today);
        //��ȡ�꣬�£���
        System.out.println("����������:"+today.getYear());
        System.out.println("����������:"+today.getMonth());
        System.out.println("����������(����):"+today.getMonthValue());
        System.out.println("�����Ǽ���:"+today.getDayOfMonth());
        System.out.println("�������ܼ�:"+today.getDayOfWeek());

        //�Ӽ���ݣ��Ӻ󷵻صĶ�������޸ĺ󣬾ɵ������Ǿɵ�
        LocalDate changeDate = today.plusYears(1);
        System.out.println("�Ӻ�������:"+changeDate.getYear());
        System.out.println("�ɵ�������:"+today.getYear());

        //���ڱȽ�
        System.out.println("isAfter:"+changeDate.isAfter(today));
    }
}
