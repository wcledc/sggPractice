package com.atguigu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        //定义单例集合 父类引用指向子类对象 形成多态
        Collection c = new ArrayList();
        //调用add方法 添加元素
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        c.add("eee");

        //调用迭代器 遍历集合
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            if (c.equals("aaa")){
                c.remove("aaa");
            }
            System.out.println(c);
        }
    }
}
