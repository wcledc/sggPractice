package com.atguigu;

public class Demo2 {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.price = 888;
        System.out.println(ph.price);
        ph.brand = "华为";
        System.out.println(ph.brand);
        ph.size = 8.5;
        System.out.println(ph.size);
        ph.call();
        ph.playgames();
    }
}
//定义一个手机类
class Phone{
    //成员变量（属性）  价格 品牌 尺寸
    int price;
    String brand;
    double size;

    //成员方法  打电话 打游戏
    public void call(){
        System.out.println("call---");
    }
    public void playgames(){
        System.out.println("playgames---");
    }
}

