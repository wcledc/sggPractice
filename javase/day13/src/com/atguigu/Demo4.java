package com.atguigu;

/*
    finally
    关键字  最终的
    不论try...catch语句中有没有异常,finally语句一定会执行(JVM退出)

        不能独立存在 配合 try...catch使用

    推荐 只用作资源的释放,不做业务的处理

 */
public class Demo4 {
    public static void main(String[] args) {
       // System.out.println(1/0);
        try {
            //可能会出现异常的代码
            System.out.println(1/1);
            //异常类型 异常对象名
        }catch (Exception e){
            //将异常信息输出到控制台
            e.printStackTrace();
            //finally: 资源释放 不做业务处理
        }finally {
            System.out.println("我一定会执行");
        }
    }
}
