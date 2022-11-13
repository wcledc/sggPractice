package io;

import bean.Person;

import java.io.*;

/*对象流 ： 把对象写成字节（序列化）
序列化：对象--->字节    方法： 实现 Serializable 接口
反序列化： 字节--->对象*/

public class Demo8 {
    public static void main(String[] args) throws Exception {
        //序列化   对象--->字节    方法： 实现 Serializable 接口
        //创建对象流并关联文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("111.txt"));
        //创建Person类对象
        Person p1 = new Person("周杰伦",23);
        Person p2 = new Person("陈冠希",22);

        //使用流
        oos.writeObject(p1);
        oos.writeObject(p2);

        //反序列化     字节--->对象
        //创建流对象 并关联文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("111.txt"));

        //使用流
        Object o1 = ois.readObject();
        Object o2 = ois.readObject();
        //Object o3 = ois.readObject();  只能对应的个数（创建几个对象就读几个） 超出报错

        System.out.println(o1);
        System.out.println(o2);

        //关流
        oos.close();
        ois.close();


    }
}
