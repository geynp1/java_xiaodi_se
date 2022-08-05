package net.xdclass.chapter9;

public class NativeMethodTest {
}

class User1 {
    private int age;
    private String name;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass()!=obj.getClass()) return false;
        User1 user = (User1) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
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
}