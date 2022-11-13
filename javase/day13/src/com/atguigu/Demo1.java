package com.atguigu;

public class Demo1 {
                                        //抛出异常
    public static void main(String[] args) throws Exception {
        new Ccc().method(); //运行时异常 （非受检异常）
    }
}
class Ccc{
                        //声明式异常
     public void method() throws Exception{
         System.out.println(1/0);
    }
}
