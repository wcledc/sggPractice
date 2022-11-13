package com.atguigu;
/*void add(int index,E   element)在此集合中的指定位置插入指定的元素
        E remove(int   index)删除指定索引处的元素，返回被删除的元素,
        E set(int index,E   element)修改指定索引处的元素，返回被修改的元素
        E get(int   index)返回指定索引处的元素*/
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"高桥凉介");
        list.add(1,"藤原拓海");
        list.add(2,"中里毅");
        list.add(3,"藤原文太");
        list.add(4,"高桥凉介");

        //System.out.println(list);
       // String remove = list.remove(3);
        //System.out.println(remove);
       // list.set(0,"陈冠希");
        //list.set(1,"周杰伦");
        //System.out.println(list.get(1));
        for (String s : list) {
            System.out.println(s);
        }


    }
}
