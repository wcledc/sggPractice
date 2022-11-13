package com.atguigu;

public class Demo01 {
    //主线程
    public static void main(String[] args) throws Exception {
        //获取当前正在执行的线程对象
        Thread thread = Thread.currentThread();
        //获取该线程名称
        System.out.println(thread.getName());
        System.out.println("*********************************");

        System.out.println("被单杀啦");

        for (int i = 10; i >0 ; i--) {

            //在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("我又活啦");
    }
}
