package com.atguigu;
/*匿名内部类

        格式:new 接口名/类名(){}

        本质:该接口/类  子类/实现类的对象  没有名字*/

public class Demo2 {
    public static void main(String[] args) {

        int num = 30;
        new Thread(){
            @Override
            public void run(){
                System.out.println(num);
            }
        }.start();
    }
}
