package com.atguigu.bean;

import com.atguigu.AgeOutOfBoundsException;

public class Person {
    private String name;
    private int age;
                                        //标记 可能有异常  格式：throws + 异常类型
    public Person(String name, int age) throws Exception{
        this.name = name;
        if (age > 0 && age <100){
            this.age = age;
        }
        //抛出异常 格式：throw new 异常对象
        throw new AgeOutOfBoundsException("年龄越界异常");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
