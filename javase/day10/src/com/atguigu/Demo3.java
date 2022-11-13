package com.atguigu;
/*
        案例
            定义一个父类 Person
            共性属性:姓名,年龄
            共性功能:睡觉
            共性抽象功能: show()  作用是描述自己是什么类,属性值是多少

            存在三个接口
            吃的接口   interface Eat {   吃的功能  }
            听的接口   interface  Hear{   听的功能}
            说的接口   interface Say{  说的功能}

            两个子类
               哑巴类  Dumb  Person的子类
               聋子类  Deaf  Person 的子类
         利用面向对象思想,使用多态的方式,调用两个子类的功能
     */
public class Demo3 {
    public static void main(String[] args) {
        //利用面向对象思想 使用多态 调用两个字类的功能 父类引用指向子类对象
        Person p1 = new Dumb();
        //调用属性并赋值（多态：访问属性:看父类; 父类如存在 则编译通过）
        p1.setName("奥利奥");
        p1.setAge(23);
        System.out.println(p1.toString());
        //调用方法（多态：访问方法:看子类; 父类如存在 则编译通过）
        p1.sleep();
        p1.eat();
        //调用子类特有方法:向下转型（强制类型转换）
        Dumb d1 = (Dumb) p1;
        d1.hear();

        System.out.println("***********************************************************");

        //父类引用指向子类对象
        Person p2 = new Deaf();
        //调用属性并赋值（多态：访问属性:看父类; 父类如存在 则编译通过）
        p2.setName("粤里粤");
        p2.setAge(21);
        System.out.println(p2.toString());
        //调用方法（多态：访问方法:看子类; 父类如存在 则编译通过）
        p2.sleep();
        p2.eat();
        //调用子类特有方法:向下转型（强制类型转换）
        Deaf d2 = (Deaf)p2;
        d2.say();
    }
}


//定义一个父类 Person 含有抽象方法 所以是抽象类
abstract class Person implements Eat{
    //定义共性属性（成员变量）:姓名,年龄 并进行封装
     private String name;
     private int age;

    //定义无参构造
    public Person(){
        System.out.println("***无参构造***");
    }

    //定义有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //提供供外界访问的get（获取值）set（设置值）的方法
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

    //重写to String 方法 用于输出属性值
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //共性功能（成员方法）:睡觉
    public void sleep(){
        System.out.println("睡大觉");
    }
    //共性抽象功能(抽象方法）: show()  作用是描述自己是什么类,属性值是多少 抽象方法没有方法体
    public abstract void show();
}

//存在三个接口 接口关键字 interface 接口命名格式 interface 接口名{}
//吃的接口
interface Eat{
    //定义接口方法 接口方法一定是抽象方法 没有方法体
    //public abstract void eat(); 系统默认提供public abstract
    void eat();
}

//听的接口
interface Hear{
    //定义接口方法 接口方法一定是抽象方法 没有方法体
    void hear();
}

//说的接口
interface Say{
    //定义接口方法 接口方法一定是抽象方法 没有方法体
    void say();
}

//定义两个子类 哑巴类 聋子类继承person类并实现三个接口
//哑巴类 继承person类并实现两个接口 吃和听
class Dumb extends Person implements Eat,Hear{
    //子类必须重写父类中的抽象方法
    @Override
    public void show(){
        System.out.println();
    }
    //子类必须重写接口中的抽象方法
    @Override
    public void eat(){
        System.out.println("哑巴在吃鸡蛋灌饼");
    }
    @Override
    public void hear(){
        System.out.println("哑巴在听不能说的秘密");
    }
    //重写to String 方法 用于输出属性值
    @Override
    public String toString() {
        return "Dumb{" +
                "姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                '}';
    }
}

//聋子类 继承person类并实现两个接口 吃和说
class Deaf extends Person implements Eat,Say{
    //子类必须重写父类中的抽象方法
    @Override
    public void show(){
        System.out.println();
    }
    //子类必须重写接口中的抽象方法
    @Override
    public void eat(){
        System.out.println("聋子在吃烤冷面");
    }
    @Override
    public void say(){
        System.out.println("聋子说再给我两分钟");
    }
    //重写to String 方法 用于输出属性值
    @Override
    public String toString() {
        return "Deaf{" +
                "姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                '}';
    }
}


