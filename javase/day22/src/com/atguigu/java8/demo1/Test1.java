package com.atguigu.java8.demo1;
/*Lambda表达式的省略格式:
        *      1.Lambda表达式()中形参的数据类型可以省略不写
        *          注意:所有形参的数据类型写与不写必须统一,否则编译报错
        *      2.Lambda表达式()中形参的个数有且仅有一个时,省略数据类型的同时可以将()一同省略
        *      3.Lambda表达式{}中语句体有且仅有一句的时,可以同时省略"{}","语句体的;","return"
        *          注意:"{}","语句体的;","return"这三个内容必须同时省略
        */
public class Test1 {
    public static void main(String[] args) {
        //使用匿名内部类创建接口的实现类对象
        SuperInterface sup = new SuperInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        sup.print("啦啦啦");

        System.out.println("**********************************");
        //lambda表达式：   接口名 对象名 = （方法形参列表）-> {方法体}
        //前提：支持匿名内部类实现
        //     有且只有一个抽象方法
        SuperInterface sup2 = (String str) -> {
            System.out.println(str);
        };
        sup2.print("呼呼呼");
    }
}