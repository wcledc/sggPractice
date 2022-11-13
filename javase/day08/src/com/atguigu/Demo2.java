package com.atguigu;

import java.security.PublicKey;

public class Demo2 {
    public static void main(String[] args) {
        //通过构造器创建父类对象
        Car c = new Car();

        //通过无参构造创建子类宝马类对象
        BMW bm = new BMW();
        bm.price = 1200000; //调用对象属性并赋值
        bm.colour = "战斗灰"; //调用对象属性并赋值
        System.out.println("x6M价格: " + bm.price + "x6M颜色: " + bm.colour); //打印输出属性值
        bm.traver();  //调用方法
        bm.speed();   //调用方法

        //通过有参构造创建子类奔驰类对象
        Benz bc = new Benz(1000000,"磨砂黑"); //有参构造直接赋值
        System.out.println("G63价格: " + bc.price + "G63颜色: " + bc.colour); //打印输出属性值
        bc.traver();  //调用方法
        bc.speed();   //调用方法
    }
}

//创建一个父类 汽车类
class Car{
    //定义属性 价格 颜色
    int price;
    String colour;

    //定义无参构造
    public Car(){
        System.out.println("***父类无参构造***");
    }
    //定义有参构造
    public Car(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    //定义方法  行驶 减速
    public void traver(){
        System.out.println("汽车在行驶");
    }
    public void speed(){
        System.out.println("汽车在减速");
    }
}

//创建子类  宝马类
class BMW extends Car{
    //定义无参构造
    public BMW(){
        System.out.println("***子类宝马类无参构造***");
    }
    //定义有参构造
    public BMW(int price, String colour) {
        //通过super访问父类有参构造
        super(price, colour);
    }
}

//创建子类  奔驰类
class Benz extends Car{
    //定义无参构造
    public Benz(){
        System.out.println("***子类奔驰类无参构造");
    }
    //定义有参构造
    public Benz(int price, String colour) {
        //通过super访问父类有参构造
        super(price, colour);
    }
}