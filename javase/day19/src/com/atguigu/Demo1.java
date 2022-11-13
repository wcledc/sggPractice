package com.atguigu;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,5,7,2);

        Collections.sort(list);
        System.out.println(list);
    }
}
