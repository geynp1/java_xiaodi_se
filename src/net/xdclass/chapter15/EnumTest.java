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
        //name()函数
        String name = dayEnum.name();
        System.out.println(name);
        //ordinal()不要用，里面加入其他值会变化
        int id = dayEnum.ordinal();
        System.out.println(id);
        //toString和name方法一样
        dayEnum.toString();
        //通过字符串其确定枚举类型
        DayEnum d = DayEnum.valueOf("MONDAY");
        System.out.println(d.name());
        //values把枚举中的所有元素组成数组
        DayEnum[] arr = DayEnum.values();
        for (DayEnum temp : arr) {
            System.out.println(temp.name());
        }
    }
}
//值推荐大写
enum DayEnum{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

enum SexEnum{
    BOY,GIRL
}