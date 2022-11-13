package com.atguigu;

import java.security.PublicKey;

public class Demo5 {
    public static void main(String[] args) {
        //通过无参构造创建对象
        Phone p1 = new Phone();
        //调用属性并赋值
        p1.setBread("华为");
        p1.setSize(8.7);
        p1.setPrice(9999);
        //打印输出结果
        System.out.println("品牌: " + p1.getBread() + ",尺寸: " + p1.getSize() + "价格: " + p1.getPrice());
        //调用方法
        p1.call();
        p1.games();

        //通过有参构造创建对象
        Phone p2 = new Phone("小米",8.5,8888);
        System.out.println("品牌: " + p2.getBread() + ",尺寸: " + p2.getSize() + "价格: " + p2.getPrice());
        p2.call();
        p2.games();

    }
}
//创建一个手机类
class Phone{
    //定义属性（成员变量） 品牌 尺寸 价格 并对属性进行封装
    private String bread;
    private double size;
    private int price;

    //定义无参构造
    public Phone(){
        System.out.println("无参构造");
    }
    //定义有参构造
    public Phone(String bread,double size,int price){
        //局部变量给成员变量赋值
        this.bread = bread;
        this.size = size;
        this.price = price;
    }

    //定义get（获取属性） set（设置） 方法 供外界访问
    public String getBread(){
        return bread;
    }
    public void setBread(String bread){
        this.bread = bread;
    }

    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    //定义功能（成员方法)
    public void call(){
        System.out.println("打电话吧");
    }
    public void games(){
        System.out.println("打游戏");
    }
}
