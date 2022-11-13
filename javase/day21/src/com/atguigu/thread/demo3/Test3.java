package com.atguigu.thread.demo3;

public class Test3 {
    public static void main(String[] args) {
     //创建线程的动作对象
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(CEO.getCeo());
            }
        };

        //创建线程对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();

    }
}
