package net.xdclass.chapter04.episode07;

public class VariableTypeTest {


   public   static String NAME;

    public  static int AGE;

    public  static boolean FLAG;

    public static void  main(String [] args){

//        System.out.println(NAME);
//        System.out.println(AGE);
//        System.out.println(FLAG);
//        System.out.println(Student.PREFIX);
//
//        Student student = new Student();
//
//        student.setAge(10);
//        student.setName("小明");
//
//       System.out.println(student.getAge());
//       System.out.println(student.getName());

        Student student = new Student();
       String content =  student.introduce();
       System.out.println(content);

    }


    public void aa(){

        System.out.println(VariableTypeTest.NAME);

    }
}
