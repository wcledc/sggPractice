package com.atguigu;
/*static 修饰符：静态的
        特点：
        1.随着类的加载而加载
        2.优先于对象存在
        3.被所有的对象所共享
        4.增加了一种成员的调用方式，可以直接使用类名进行调用
        调用特点：静态的只能访问静态的 不能访问非静态的*/
import jdk.internal.dynalink.beans.StaticClass;

import java.security.PublicKey;

public class Demo3 {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        p.brand = "华为";
        p.price = 9999;
        Phone.colour = "黑色";
        System.out.println("品牌: " + p.brand + ",价格: " + p.price);
        p.call();
        Phone.games();
    }
}
//创建类
class Phone{
    //定义属性 成员变量 品牌 价格 （实例变量--》所属于对象）
    String brand;
    int price;
    //静态属性 静态成员变量 随着类加载而加载 先于对象存在 （静态变量--》所属于类）
    static String colour;

    //定义行为(成员方法）----所属于对象
    public void call(){
        System.out.println("手机可以打电话");
    }
    //定义静态方法 由static修饰 ----所属于类
    public static void games(){
        System.out.println("手机可以打游戏");
    }

}
