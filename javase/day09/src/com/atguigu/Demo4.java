package com.atguigu;

public class Demo4 {
    public static void main(String[] args) {
        //创建对象
        Fu f1 = new Fu();
        //无参构造创建子类对象
        Zi z1 = new Zi();
        //有参构造创建子类对象
        Zi z2 = new Zi(20);
    }
}
class Fu{
    //定义属性
    int num;
    //父类静态代码块
    static {
        System.out.println("父类静态代码块");
    }
    //父类非静态代码块
    {
        System.out.println("父类非静态代码块");
    }
    //父类无参构造
    public Fu(){
        System.out.println("父类无参构造");
    }
    //父类有参构造
    public Fu(int num) {
        this.num = num;
    }
}
class Zi extends Fu{
    //子类静态代码块
    static {
        System.out.println("子类静态代码块");
    }
    //子类非静态代码块
    {
        System.out.println("子类非静态代码块");
    }
    //子类无参构造
    public Zi(){
        System.out.println("子类无参构造");
    }
    //子类有参构造
    public Zi(int num) {
        super(num);
    }
}
