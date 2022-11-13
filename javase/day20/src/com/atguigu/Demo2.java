package com.atguigu;
/** 线程开启方式1:继承Thread类
        *      1.创建Thread类的子类
        *      2.根据父类的构造器生成合适的构造器
        *      3.重写父类的run()
        *          补充:run()的方法体就是"执行线程"的动作
        *      4.在测试类中,需要多少条线程对象就new多少个Thread类的子类对象
        *      5.开启线程*/

public class Demo2 {
    public static void main(String[] args) {
//        4.在测试类中,需要多少条线程对象就new多少个Thread类的子类对象
        ThreadDemo3 thread1 = new ThreadDemo3("线程1");
        ThreadDemo3 thread2 = new ThreadDemo3("线程2");

//        5.开启线程
        thread1.start();
        thread2.start();
    }
}


