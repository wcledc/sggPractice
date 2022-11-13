package com.atguigu.java8.demo3;

public class Test3 {
    public static void main(String[] args) {
        SuperInterfaceA sia = (a,b) -> a + b;
        int sum = sia.getsum(3,5);
        System.out.println("sum = " + sum);
        System.out.println("****************************");
        SuperInterfaceB sib = str -> Integer.parseInt(str);

        int num = sib.toChange("123");
        System.out.println("num = " + num);
    }
}
