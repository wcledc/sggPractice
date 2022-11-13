package com.atguigu;

import javax.rmi.CORBA.Stub;

public class Demo2 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person();
        arr[1] = new Person();
        arr[2] = new Person();
        new Person().age = 18;
        new Person().name = "张三";
        new Person().height = 196;
        System.out.println();

    }
}
class Person{
    int age;
    String name;
    int height;

    public void eat(){
        System.out.println("在吃饭");
    }
    public void sleep(){
        System.out.println("在睡觉");
    }
    public void show(){
        System.out.println("姓名：");
    }
}
