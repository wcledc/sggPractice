package com.atguigu.thread.practice;
//单例设计模式：创建唯一对象的固定解决方案
public class Wife {
    //立即加载模式 （饿汉式）

    //创建唯一对象  为了外界可以访问唯一对象将其进行静态化处理
    //为了唯一对象在外界的安全性，将其进行私有化
    private static Wife w1 = new Wife();
    //将唯一对象所属类的构造器私有化
   private Wife(){}
    //提供供外界获取的get方法
    public static Wife getW1() {
        return w1;
    }
}
