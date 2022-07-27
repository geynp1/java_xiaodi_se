package net.xdclass.chapter15;

public class EnumTest {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String args[]){
        DayEnum dayEnum = DayEnum.FRIDAY;
    }
}
//值推荐大写
enum DayEnum{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

enum SexEnum{
    BOY,GIRL
}