package com.atguigu;
/*
    Collection
    - 添加元素
    add(E obj)：添加元素对象到当前集合中

    - 删除元素
    boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
    boolean removeIf(Object o)：根据条件进行移除
    void   clear()：清空集合中的元素

    - 查询与获取元素
    boolean isEmpty()：判断当前集合是否为空集合。
    boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
    int size()：获取当前集合中实际存储的元素个数
    Object[] toArray()：返回包含当前集合中所有元素的数组

    - 带All的方法后面讲
    addAll(Collection<? extends E> other)：添加other集合中的所有元素对象到当前集合中
    boolean removeAll(Collection<?> coll)：从当前集合中删除所有与coll集合中相同的元素。
    boolean containsAll(Collection<?> c)：判断c集合中的元素是否在当前集合中都存在。
     */
import bean.Person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        //接口不能实例化 形成多态 父类引用指向子类对象  目的是访问父类的方法
        Collection c = new ArrayList();

        //添加元素
        //add(E obj)：添加元素对象到当前集合中
        c.add("aaa");
        c.add("edc");
        c.add(true);
        c.add(new Person("冠希",23));
        c.add("我亦飘零久");
        System.out.println(c.size());
        System.out.println(c);
    }

    @Test
    public void Test1(){
        Collection c = new ArrayList();

        //添加元素
        //add(E obj)：添加元素对象到当前集合中
        c.add("aaa");
        c.add("edc");
        c.add(true);
        c.add(new Person("冠希",23));
        c.add("我亦飘零久");
        System.out.println(c.size());
        System.out.println(c);

        //        - 删除元素
//        boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        boolean b1 = c.remove("aaa");
        System.out.println(c);
        System.out.println(b1);

//        boolean removeIf(Object o)：根据条件进行移除
        c.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(true);
            }
        });
        System.out.println(c);
//        void   clear()：清空集合中的元素
        c.clear();
        System.out.println(c);
    }

    @Test
    public void Test2(){
        Collection c = new ArrayList();
        c.add("ddd");
        c.add("万里长城永不倒");
        c.add("千里黄河水滔滔");
        c.add("edc");
        System.out.println(c);
        System.out.println(c.size());

//        - 查询与获取元素
//        boolean isEmpty()：判断当前集合是否为空集合。
        System.out.println(c.isEmpty());

//        boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
        System.out.println(c.contains("edc"));

//        int size()：获取当前集合中实际存储的元素个数
        System.out.println(c.size());

//        Object[] toArray()：返回包含当前集合中所有元素的数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
