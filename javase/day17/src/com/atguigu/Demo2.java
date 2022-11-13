package com.atguigu;

import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
            list.addFirst(11);
            list.add(33);
            list.add(23);
            list.add(56);
            list.addLast(54);
        System.out.println(list.size());
        System.out.println(list);


    }
}
