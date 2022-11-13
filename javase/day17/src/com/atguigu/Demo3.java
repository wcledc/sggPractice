package com.atguigu;
/*
        Set 集合
            存储无序,无索引,不可以存储重复的元素

            核心:  保证元素的唯一性

            equals()  比较属性值
            hashCode()  相同属性值的对象  code相同  目的是--> 调用equals()
                        不相同属性值的对象  code尽量相同  目的是--> 节约equals()的次数
     */
import bean.Student;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo3 {
    public static void main(String[] args) {
        //set集合 无序 无索引 不可重复
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("叶湘伦",21));
        set.add(new Student("叶湘伦",21));
        set.add(new Student("叶惠美",24));
        set.add(new Student("叶惠美",24));
        set.add(new Student("路小雨",20));
        set.add(new Student("陈冠希",23));
        set.add(new Student("路小雨",20));
        set.add(new Student("陈冠希",23));

        System.out.println(set.size());
        System.out.println(set);
    }
}
