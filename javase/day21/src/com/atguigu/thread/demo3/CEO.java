package com.atguigu.thread.demo3;

public class CEO {
    private static CEO ceo;

    private CEO(){}

    public static CEO getCeo() {
        if (ceo == null) {
            synchronized (CEO.class) {
                if (ceo == null){
                    ceo = new CEO();
                }
            }
        }
        return ceo;
    }
}
