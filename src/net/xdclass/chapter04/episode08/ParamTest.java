package net.xdclass.chapter04.episode08;

public class ParamTest {

    public static void main(String [] args){

//        ParamTest.calculateAdd(10,20);
//        ParamTest.test1("小D课堂",3);

        Student student = new Student();
        student.setAge(10);
        System.out.println("操作前="+student.getAge());
        changeAge(student);
        System.out.println("操作后="+student.getAge());

    }



    public static  void calculateAdd(int numberA, int numberB){

        System.out.println("numberA="+numberA);
        System.out.println("numberB="+numberB);

    }



    public static  void test1(String name, int age){

        System.out.println("name="+name);
        System.out.println("age="+age);

    }


    public static void test2(){
        System.out.println("这个是test1方法");
    }




    public static void changeAge(Student student){
        student.setAge(20);
    }


    public static Student changeAge2(Student student){
        student.setAge(20);
        return student;
    }

}
