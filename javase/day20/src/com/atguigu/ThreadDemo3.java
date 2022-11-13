package com.atguigu;

//1.创建Thread类的子类 继承Thread类
public class ThreadDemo3 extends Thread{
    //生成构造器
    public ThreadDemo3() {
    }

    public ThreadDemo3(String name) {
        super(name);
    }

    //重写run方法
    @Override
    public void run(){
        for (int i = 1; i < 30; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
