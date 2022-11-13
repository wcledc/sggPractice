package com.atguigu.reflect.demo2;

import java.lang.reflect.Constructor;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        //1.获取Student类的字节码文件对象
        Class<?> c = Class.forName("com.atguigu.reflect.demo2.Student");

        //2.通过Student字节码文件对象获取无参构造对象
        Constructor<?> constructor = c.getDeclaredConstructor();

        //3.通过无参构造器对象进行Student对象的创建
        Object o = constructor.newInstance();
        System.out.println(o);

        System.out.println("*****************************************");

        //如果通过无参构造器进行对象的创建，可以将上述过程进行简化

        //1.获取Student类的字节码文件对象
        c = Class.forName("com.atguigu.reflect.demo2.Student");

        //2.通过Class对象进行对象创建（仅限使用无参构造器）
        Object obj = c.newInstance();

        System.out.println(obj);
    }
}
