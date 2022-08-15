package net.xdclass.chapter06.episode08;

public class InstanceOfTest {
    public static void main(String args[]) {
        Student student = new Student();
        boolean result = student instanceof Person;
        System.out.println(result);

        Person person1 = new Student();
        Person person2 = new Teacher();

        System.out.println("person1 instance of Student" );
        System.out.println(person1 instanceof Student);

        System.out.println("person2 instance of Student" );
        System.out.println(person2 instanceof Student);

        if (person1 instanceof Student) {
            Student student1 = (Student)person1;
            student1.talk();
        }
        if (person2 instanceof Teacher) {
            Teacher teacher = (Teacher) person2;
            teacher.talk();
        }
    }
}
