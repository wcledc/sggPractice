package com.atguigu;

/*
字符串拼接问题及结论
String  + 的问题及结论
常量优化机制: 编译期时知晓常量值,优化

（1）常量+常量：结果是常量池(常量优化,因为编译期间就可以确定结果)
（2）常量+变量 或 变量+变量：结果是堆

（3）拼接后调用intern方法：结果在常量池
 */
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";

        String s4 = "Hello" + "World";
        String s5 = s1 + s2;
        String s6 = "Hello" + s2;

        String s7 = s5.intern();
        String s8 = s6.intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s3 == s8);
    }
}
