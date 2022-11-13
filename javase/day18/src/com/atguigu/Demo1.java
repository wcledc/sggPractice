package com.atguigu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个map集合
        HashMap<Integer, String> map = new HashMap<>();

        String put1 = map.put(1, "edc");
        String put2 = map.put(1, "jay");
        String put3 = map.put(2, "lbj");
        String put4 = map.put(2, "al");
        String put5 = map.put(3, "mac");
        String put6 = map.put(4, "kobe");
        String put7 = map.put(5, "jhd");

        //System.out.println(map.size());
        //System.out.println(map);
        //遍历集合
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        System.out.println("******************************************");

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + "-->" + map.get(key));
        }

    }
}
