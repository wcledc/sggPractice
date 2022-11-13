package com.atguigu.java8.demo1;
/*StreamAPI
        *      含义:可以针对容器中的数据进行高效操作的流对象
        *      分类:
        *          中间操作(延迟操作)
        *              方法的返回类型是Stream类型的方法
        *          终结操作
        *              方法的返回类型不是Stream类型的方法*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class demo1 {
    public static void main(String[] args) {
        //通过单例集合获取Stream对象（只能单例 双例不行）
        ArrayList<Object> list = new ArrayList<>();
        //批量给集合添加元素
        Collections.addAll(list,"a","b","c");
        System.out.println(list);
        //通过集合对象获取stream对象
        Stream<Object> s1 = list.stream();
        System.out.println(s1);
        System.out.println("*******************************");

        //通过数组获取
        String[] arr = {"c","b","d"};
        Stream<String> s2 = Arrays.stream(arr);
        System.out.println(s2);
        System.out.println("*******************************");

        //Stream的of方法直接获取
        Stream<String> s3 = Stream.of("e", "d", "c");
        System.out.println(s3);

    }
}
