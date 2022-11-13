package com.atguigu;

import org.testng.annotations.Test;

/*
       public StringBuilder append(任意类型)  // 添加数据，并返回对象本身
       public StringBuffer insert(int offset,String str) //指定位置添加数据，并返回对象本身

       public StringBuffer deleteCharAt(int index):  //删除指定位置的字符，并返对象回本身
       public StringBuffer delete(int start,int end) // 删除从start开始到end的内容，并返回对象本身(start,end]

       public StringBuffer replace(int start,int end,String str) // 从start开始到end用str替换，并返回对象本身(start,end]
       public StringBuilder reverse() // 返回相反的字符序列

       public String substring(int start) // 从指定位置截取到末尾,返回一个字符串
       public String substring(int start,int end) // 截取(start,end]区间的内容，返回一个字符串
    */
public class Demo1 {
    public static void main(String[] args) {
//        public StringBuilder()创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1 + "***");

//        public StringBuilder(String   str)根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("edc");
        System.out.println(sb2);
    }

    @Test
    public void Test1(){
//        public StringBuilder append(任意类型)  // 添加数据，并返回对象本身
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("jay");
        StringBuilder sb3 = sb1.append(333);
        StringBuilder sb4 = sb1.append('亦');

        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);
        System.out.println("sb4 = " + sb4);
        System.out.println(sb1 == sb2);

//        public StringBuffer insert(int offset,String str) //指定位置添加数据，并返回对象本身
        StringBuilder sb5 = new StringBuilder("sdjfhjhgs");
        StringBuilder sb6 = sb5.insert(2, "$$$");
        System.out.println("sb6 = " + sb6);
        System.out.println("sb5 = " + sb5);
    }

    @Test
    public void test2(){

//        public StringBuffer deleteCharAt(int index):  //删除指定位置的字符，并返对象回本身
        StringBuffer sb7 = new StringBuffer("我亦飘零久");
        StringBuffer sb8 = sb7.deleteCharAt(4);
        System.out.println("sb8 = " + sb8);
        System.out.println(sb8 == sb7);

//        public StringBuffer delete(int start,int end) // 删除从start开始到end的内容，并返回对象本身(start,end]
        StringBuffer sb9 = sb7.delete(0, 2);
        System.out.println("sb9 = " + sb9);
        System.out.println(sb9 == sb8);
    }

    @Test
    public void Test3(){

//        public StringBuffer replace(int start,int end,String str) // 从start开始到end用str替换，并返回对象本身(start,end]
        StringBuilder sb1 = new StringBuilder("life is fucking movie");
        StringBuilder sb2 = sb1.replace(8, 15, "*****");
        System.out.println("sb2 = " + sb2);

//        public StringBuilder reverse() // 返回相反的字符序列
        StringBuilder sb3 = new StringBuilder("你是年少的欢喜");
        StringBuilder sb4 = sb3.reverse();
        System.out.println("sb4 = " + sb4);
        System.out.println(sb4 == sb3);
    }

    @Test
    public void Test4(){
//        public String substring(int start) // 从指定位置截取到末尾,返回一个字符串
        StringBuilder sb1 = new StringBuilder("如诗亦如是");
        String sb2 = sb1.substring(2);
        System.out.println("sb2 = " + sb2);

//        public String substring(int start,int end) // 截取(start,end]区间的内容，返回一个字符串
        String sb3 = sb1.substring(1, 3);
        System.out.println("sb3 = " + sb3);
        //返回的是字符串 字符串会产生一个新的对象 所以为false
        System.out.println(sb3 == sb2);
    }

}
