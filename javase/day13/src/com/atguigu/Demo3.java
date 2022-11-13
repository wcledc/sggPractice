package com.atguigu;
/*
     2> 自己处理 try...catch
        避免程序的终止

        格式:
          try{
             可能会引发异常的代码
          }catch(Exception e){//(会获取的异常类型 异常的对象名)
             处理异常的操作
          }
        执行顺序:
            1.如果try语句中发生了异常,后面的代码则不执行,跳转到对应的catch语句中
            2.catch语句捕获到了对应的异常类型,里面的代码则是处理异常的操作

        注意事项:
            1.如果catch语句中捕获的异常有多个,要从小到大去进行捕获(取值范围 子类)
            2. 常规的捕获,只捕获一个大的异常
     */
public class Demo3 {
    public static void main(String[] args) {
        //定义一个int型数组
        int[] arr = {1,2,4,5,6};
       try{
           //可能会出现异常的代码
           //arr = null;
           System.out.println(arr[7]);
           System.out.println("我执行了吗");
           //捕获异常 （异常种类 异常对象名）
       }catch (NullPointerException e){
           //获取的是异常的描述信息
           System.out.println(e.getMessage());
           //将异常信息输出到控制台
           e.printStackTrace();
           //捕获异常 （异常种类 异常对象名）
       }catch (Exception e){
           //获取的是异常的描述信息
           System.out.println(e.getMessage());
           //将异常信息输出到控制台
           e.printStackTrace();
           System.out.println("我会执行的");
           //finally: 释放资源 一定会执行 只作用以资源释放 不做业务处理
       }finally {
           System.out.println(arr[3]);
       }
    }
}
