package com.atguigu;

import java.util.Scanner;

/*
        String 常量池来维护常量对象
            特点:如果该常量 没有 创建
                 已经存在,不再重新创建,直接引用
        public String():空构造   “”
        public String(byte[] bytes):把字节数组转成字符串
        public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串

        public String(char[] value):把字符数组转成字符串   //字符常量 字符串
        public String(char[] value,int index,int count):把字符数组的一部分转成字符串

        public String(String original):把字符串常量值转成字符串
     */
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   //比较的是地址值

        System.out.println("**********************构造****");
        String s3 = new String();
        System.out.println("s3 = " + s3);

        byte[] arr1 = {97,98,99};
        String s4 = new String(arr1);
        System.out.println("s4 = " + s4);
        String s5 = new String(arr1,0,2);
        System.out.println("s5 = " + s5);

        char[] arr2 = {'x','y','z'};
        String s6 = new String(arr2);
        System.out.println("s6 = " + s6);
        String s7 = new String(arr2,1,1);
        System.out.println("s7 = " + s7);

        String s8 = new String("abc");
        System.out.println("s8 = " + s8);
        System.out.println(s1 == s8);
    }
}
