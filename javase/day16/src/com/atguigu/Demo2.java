package com.atguigu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        //定义单例集合 父类引用指向子类对象 形成多态
        Collection c = new ArrayList();
        //调用add方法 添加元素
        c.add("jay");
        c.add("叶湘伦");
        c.add("叶惠美");
        c.add("藤原拓海");
        c.add("七里香");
        //调用size方法 查看集合长度
        System.out.println(c.size());

        //调用迭代器 遍历集合
        Iterator iterator = c.iterator();
        //.hasNext 判断集合下标是否有元素
        while (iterator.hasNext()){
            //.next 输出迭代的元素
            Object o = iterator.next();
            if (c.contains("jay")){
                iterator.remove();
            }
            //o 代表集合的每一个元素值
            System.out.println(o);
        }

        System.out.println("*************************************");

        //使用增强for循环 遍历集合 （增强for循环快捷键: iter）
        // (集合/数组）中元素的数据类型 变量名 : 遍历的对象（容器）(数组/集合)
        for(Object obj: c){
            //直接输出变量
            System.out.println(obj);
        }
    }
}
