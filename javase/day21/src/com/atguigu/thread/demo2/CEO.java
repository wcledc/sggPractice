package com.atguigu.thread.demo2;
//单例加载模式
/*立即加载模式(饿汉式)弊端:
        *      在一定程度上浪费堆内存空间的使用
        *
        * 延迟加载模式(懒汉式)步骤:
        *      1.将唯一对象所属类的构造器进行私有化
        *      2.在唯一对象所属类成员位置声明唯一的对象变量
        *      3.为了在外界可以访问唯一对象变量,将其进行静态化处理
        *      4.为了唯一对象变量在外界的安全性,将其进行私有化处理
        *      5.对外提供唯一对象变量的获取方式,并在第一次获取时创建唯一对象*/
public class CEO {
   private static CEO ceo;
    private CEO(){}

    public static CEO getCeo() {
        if (ceo == null){
            ceo = new CEO();
        }
        return ceo;
    }
}
