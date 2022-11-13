package com.atguigu.thread.practice;

public class WifeTest {
    public static void main(String[] args) {
        Wife w = Wife.getW1();
        Wife w2 = Wife.getW1();
        Wife w3 = Wife.getW1();

        System.out.println(w);
        System.out.println(w2);
        System.out.println(w3);

    }
}
