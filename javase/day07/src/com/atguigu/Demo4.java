package com.atguigu;

public class Demo4 {
    public static void main(String[] args) {
       //调用无参构造创建对象
        Student stu = new Student();
        //给属性进行赋值
        stu.setAge(18);
        stu.setName("迪迦");
        stu.setId(3);
        //打印输出
        System.out.println("年龄: " + stu.getAge() + ",姓名: " + stu.getName() + ",学号: " + stu.getId());
       /* System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.getId());*/

    }
}
class Student{
    //定义成员变量（属性）并给属性进行封装
    private int age;
    private String name;
    private int id;

    //无参构造
    public Student(){}

    //有参构造
    public Student(int age,String name,int id){
        //局部变量给成员变量赋值
        this.age = age;
        this.name = name;
        this.id = id;
    }

    //提供供外界访问的get（获取） set 方法（设置）
    //get用于提供外界访问(获取该属性)
    public int getAge(){
        return age;
    }
    //set用于设置属性值
    public void setAge(int age){
        //局部变量给成员变量赋值
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
