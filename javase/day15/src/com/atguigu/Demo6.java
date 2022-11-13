package com.atguigu;

import org.testng.annotations.Test;

/*
      - StringBuilder转换为String
         - 通过构造方法  public String(Object obj)
         - 通过toString()方法
         - 通过subString(0,length)
       - String转换为StringBuilder
         - 通过构造方法public StringBuilder(String s)
         - 通过append()方法
   */
public class Demo6 {
    public static void main(String[] args) {
//        - StringBuilder转换为String
//                - 通过构造方法  public String(Object obj)
//                - 通过toString()方法
//                - 通过subString(0,length)
        StringBuilder sb1 = new StringBuilder("压力面前保持优雅");
        String s1 = new String(sb1);
        String s2 = sb1.toString();
        String s3 = sb1.substring(0, sb1.length());
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }

    @Test
    public void Test1(){
//        - String转换为StringBuilder
//                - 通过构造方法public StringBuilder(String s)
//                - 通过append()方法
        String s1 = ("万里长城永不倒");
        System.out.println("s1 = " + s1);
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println("sb1 = " + sb1);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = sb2.append(s1);
        System.out.println("sb3 = " + sb3);
    }
}
