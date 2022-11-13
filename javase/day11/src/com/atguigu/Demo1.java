package com.atguigu;

public class Demo1 {
    //需求：基本数据类型 和String 进行转换
    public static void main(String[] args) {
        //int类型包装类
        Integer c = 66; //自动装箱
        int num = c;  //自动拆箱
        System.out.println("num = " + num);
        System.out.println("***************************************");
        //基本数据类型转换为--->String
        // String.valueOf(任意类型)  任意类型.toString()
        //方法1：调用value Of方法
        String s = String.valueOf(c);
        System.out.println("s = " + s);
        //方法2：任意类型.toString()
        String s2 = Integer.toString(44);
        System.out.println("s2 = " + s2);
        //方法3：任意数据类型和字符串拼接都会变成字符串
        String s3 = c + " ";
        System.out.println("s3 = " + s3);
        System.out.println("***************************************");

        //String转换为---->基本数据类型
        // 包装类的构造(String s)  包装类.valueOf(String s)
        //方法1：包装类.valueOf(String s)
        String d = "333";
        Integer i = Integer.valueOf(d);
        System.out.println("i = " + i);
        //方法2： 包装类的构造(String s)
        Integer i2 = new Integer(d);
        System.out.println("i2 = " + i2);
    }
}
