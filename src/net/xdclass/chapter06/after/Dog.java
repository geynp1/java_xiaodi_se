package net.xdclass.chapter06.after;

public class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    @Override
    public void sleep() {
        System.out.println("狗白天闭着眼睛睡觉");
    }

    public void test(){
        super.sleep(); //调用父类方法,super表示父类的引用
        //第哦啊用当前类的方法，this表示当前对象的引用
        this.sleep();
    }
}
