package com.atguigu.java8.demo2;

public class Test2 {
    public static void main(String[] args) {
        /*Runnable run = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 1; i <= 30 ; i++) {
                    System.out.println(name + "-->" + i);
                }
            }
        };*/
        //使用lambda表达书简化上述操作
        Runnable run1 = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 30 ; i++) {
                System.out.println(name + "-->" + i);
            }
        };

        Thread t1 = new Thread(run1,"线程1");
        Thread t2 = new Thread(run1,"线程2");

        t1.start();
        t2.start();


    }
}
