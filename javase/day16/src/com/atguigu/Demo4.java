package com.atguigu;

import bean.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo4 {
    public static void main(String[] args) {
        Collection<Person> c = new ArrayList<>();
        c.add(new Person("高桥凉介",23));
        c.add(new Person("藤原拓海",24));
        c.add(new Person("中里毅",25));

        System.out.println(c.size());
        //System.out.println(c);

        Iterator<Person> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        /*for (Person person : c) {
            System.out.println(c);
        }*/
    }
}
