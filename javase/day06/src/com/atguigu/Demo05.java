package com.atguigu;

public class Demo05 {
    public static void main(String[] args) {
    //创建对象
        Car c = new Car();
        //调用属性并赋值
        c.price = 300000;
        c.brand = "宝马";
        c.legth = 50;
        System.out.println("价格: " + c.price + ",品牌: " + c.brand + ",长度: " + c.legth);
        //调用方法
        c.speed();
        c.traver();
    }
}
//定义一个汽车类
class Car{
    //定于成员变量（属性） 价格 品牌 长
    long price;
    String brand;
    int legth;
    //定义方法 功能  行驶  减速
    public void traver(){
        System.out.println("汽车在行驶");
    }
    public void speed(){
        System.out.println("汽车在减速");
    }
}
