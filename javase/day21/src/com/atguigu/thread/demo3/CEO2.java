package com.atguigu.thread.demo3;

public class CEO2 {
    private static CEO2 ceo2;

    private CEO2(){}

    public static CEO2 getCeo2() {
        if (ceo2 == null){
            method();
        }
        return ceo2;
    }
    public static synchronized void method(){
        if (ceo2 == null){
            ceo2 = new CEO2();
        }
    }
}
