package com.atguigu;

import bean.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();

        map.put(1,new Person("edc",23));
        map.put(2,new Person("jay",21));
        map.put(3,new Person("gai",22));
        map.put(3,new Person("lbj",36));
        map.put(4,new Person("t-mac",43));
        map.put(5,new Person("ai",39));

        System.out.println(map.size());

        Set<Map.Entry<Integer, Person>> put = map.entrySet();
        for (Map.Entry<Integer, Person> entry : put) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
