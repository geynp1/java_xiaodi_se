package net.xdclass.chapter13;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        date = new Date(1659282355761L);
        System.out.println(date);

    }
}
