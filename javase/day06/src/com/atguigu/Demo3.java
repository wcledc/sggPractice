package com.atguigu;

public class Demo3 {
    public static void main(String[] args) {
        //1.创建对象
        // 格式：类名 对象名 = new 类名（）;
        Student stu = new Student();
        //2.使用对象
        //对象名.属性名 / 对象名.方法名();
        stu.name = "张三";  //给属性赋值
        stu.id = 3;
        stu.age = 18;
        System.out.println("名字：" + stu.name + ",学号: " + stu.id + ",年龄: " + stu.age);
        //调用方法（功能）
        stu.eat();
        stu.study();
    }
}
//定义一个学生类
class Student{
    //成员变量（属性）
    String name;
    int id;
    int age;
    //成员方法
    public void study(){
        System.out.println("study----");
    }
    public void eat(){
        System.out.println("eat-------");
    }
}