package com.atguigu.thread.practice;

public class HubbyTest {
    public static void main(String[] args) {
        Hubby h1 = Hubby.getHub();
        Hubby h2 = Hubby.getHub();
        Hubby h3 = Hubby.getHub();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

    }
}
