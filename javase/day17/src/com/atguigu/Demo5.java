package com.atguigu;
//需求:请编写程序,将字符串"helloatguigu"进行排序,顺序为: aegghillotuu

import java.util.Comparator;
import java.util.TreeSet;
/*
       请使用TreeSet编写程序,将字符串"helloatguigu"进行排序,顺序为: aegghillotuu

       自定义比较时
           不去重 差值永远不等于0

       TreeSet<>
       自然排序
       自定义排序(比较器排序)
           new TreeSet(比较器类型的实例  )
    */
public class Demo5 {
    public static void main(String[] args) {
        String s = "helloatguigu";
        TreeSet<Character> set = new TreeSet<>(new Comparator<Character>() {

            //compare() 返回值 代表了如何进行排序
            //0 差值为0   正值 前<后     负 前>后
            @Override
            public int compare(Character o1, Character o2) {
                int num = o1.compareTo(o2);
                return (num == 0) ? 1 : num;
            }
        });
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);

    }
}
