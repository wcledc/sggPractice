package com.atguigu;
/*
    泛型的通配符
        <?>  匹配任意任何
        <? extends 类型>  固定上边界
        <? super 类型>    固定下边界

        addAll(Collection<? extends E> c)
        c1.addAll( 参数 ) 参数的泛型 <= c1的泛型c

     */
import bean.BaseStudent;
import bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo8 {
    public static void main(String[] args) {
       Collection c1 = new ArrayList<>();
        c1.add(new Student("禁闭",23));
        c1.add(new Student("热破",21));
        c1.add(new Student("漂移",23));

        Collection c2 = new ArrayList<>();
        c2.add(new BaseStudent("擎天柱",18));
        c2.add(new BaseStudent("御天敌",30));
        c2.add(new BaseStudent("威震天",19));

        //System.out.println(c1);
        //System.out.println(c2);
        System.out.println("*****************************");

        c1.addAll(c2);
        System.out.println(c1);
        System.out.println("*****************************");
        c2.addAll(c1);
        System.out.println(c2);
    }
}
