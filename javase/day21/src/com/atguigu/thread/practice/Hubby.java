package com.atguigu.thread.practice;
//单例设计模式:创建唯一对象的固定设计格式
public class Hubby {
    //延迟加载模式（懒汉式）

    //在唯一对象所属类位置声明唯一变量 为了外界访问唯一变量将其进行静态化处理
    //为了唯一变量在外界的安全性 将其进行私有化处理
    private static Hubby hub;

    //将构造器私有化
    private Hubby(){}

    //提供供外界获取的get方法,并在第一次获取时创建唯一对象


    public static Hubby getHub() {
        if (hub == null) {
            //使用同步解决单例线程安全问题
            synchronized (Hubby.class) {
                if (hub == null) {
                    hub = new Hubby();
                }
            }
        }
        return hub;
    }
}
