package com.atguigu;

public class Demo05 {
    public static void main(String[] args) {
        //调用有参构造器创建对象并给属性进行赋值
        Teacher1 t11 = new Teacher1("陈叶",18,"女");
        //System.out.println("姓名: " + t11.name + ",年龄: " + t11.age + ",性别: " + t11.gender);
        //调用方法
        System.out.println(t11.toString());  //to String的调用格式
        t11.sleep();
        t11.eat();

    }
}
//定义一个子类 Teacher类  他的父类是根父类 Object类
class Teacher1{
    //定义属性（成员变量）
    String name;
    int age;
    String gender;

    //定义无参构造
    public Teacher1(){
        System.out.println("***无参构造***");
    }
    //定义有参构造
    public Teacher1(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //定义功能(成员方法）
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public void sleep(){
        System.out.println("老师在睡觉");
    }

    //重写to String方法 用于输出属性值
    @Override
    public String toString() {
        return "Teacher1{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + gender + '\'' +
                '}';
    }
}
