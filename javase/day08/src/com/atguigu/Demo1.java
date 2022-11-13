package com.atguigu;

public class Demo1 {
    public static void main(String[] args) {
    //调用构造器创建对象
        //父类对象  人类
        Person p = new Person();

        //调用无参构造创建子类对象  学生类
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.gender = "男";
        System.out.println("姓名: " + s.name + ",年龄: " + s.age + ",性别: " + s.gender);
        s.eat();
        s.sleep();

        //调用有参构造创建子类对象  老师类
        Teacher t = new Teacher("陈叶",18,"女");
        System.out.println("姓名: " + t.name + ",年龄: " + t.age + ",性别: " + t.gender);
        t.eat();
        t.sleep();

    }
}
//创建一个父类  人类
class Person{
    //定义属性  姓名 年龄 性别
    String name;
    int age;
    String gender;
    //定义无参构造
    public Person(){
        System.out.println("父类无参构造");
    }
    //定义有参构造
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //定义方法
    public void eat(){
        System.out.println("干饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

//创建子类   学生类
    class Student extends Person{
    //无参构造
    public Student(){
        System.out.println("子类学生类无参构造");
    }
    //有参构造
    public Student(String name, int age, String gender) {
        //super(name, age, gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
//创建子类    老师类
    class Teacher extends Person{
    //无参构造
    public Teacher(){
        System.out.println("子类老师类无参构造");
    }
    //有参构造
    public Teacher(String name, int age, String gender) {
        //super(name, age, gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}


