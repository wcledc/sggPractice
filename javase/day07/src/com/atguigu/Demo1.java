package com.atguigu;

public class Demo1 {
    public static void main(String[] args) {
        Bird b = new Bird();
        Bird b1 = new Bird(3,"lucky","猫头鹰");
        b1.show();
    }
}
//创建一个小鸟类
class Bird {
    //定义成员变量（属性)  年龄 姓名 品种
    int age;
    String name;
    String breed;

    //定义无参构造
    public Bird() {
        System.out.println("无参构造");
    }
    //定义有参构造

    public Bird(int age, String name, String breed) {
       this.age = age;
        this.name = name;
        this.breed = breed;
        System.out.println("有参构造");
    }
    //定义成员方法 （功能）
    public void fly(){
        System.out.println("猫头鹰在飞");
    }
    public void eat(){
        System.out.println("猫头鹰在觅食");
    }
    public void show(){
        System.out.println("年龄：" + age + ",姓名: " + name + ",品种: " + breed );
    }
}