package com.atguigu;
/*String
    1.所有的字符串常量 都可以作为String的实例
        2.String  不可变字符序列  指向的常量值不可变,但是重新赋值(引用)
        地址值不改变的情况下 指向的实例"abc" 属性值不可变

        一般的引用数据类型  地址值没有改变的情况下 属性值可以发生改变*/
public class Demo1 {
    public static void main(String[] args) {
        String s = "abc";
        s = "edc";
        System.out.println(s);
        String s1 = new String();
        System.out.println(s1 == s);
        String s2 = "edc";
        System.out.println(s2 == s);
    }
}
