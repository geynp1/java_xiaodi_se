package net.xdclass.chapter06;

/**
 * 6-2
 * һ��������ж�����캯��
 */
public class User {

    private int age;
    private String name;
    //���캯�����൱�������ĳ�ʼ��
    //������캯���໥���ã����д�ڷ�����һ��
    public User(){
        System.out.println("����Ĭ�Ϲ��캯��");
        this.age=120;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("˯��1");
        String name = this.name;
        System.out.println(name+"��˯��");

    }

    public void sleep(String address){
        System.out.println(address);
        System.out.println("˯��1");
    }


}
