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
public class Demo2 {
    public static void main(String[] args) {
        //利用面向对象思想,使用多态的方式,调用两个子类的功能
        //父类引用指向子类对象 （Dumb类）
        Person p = new Dumb();
        //调用属性并赋值 （多态访问特点：访问属性：看父类 父类如存在 则编译通过）
        p.setName("奥利奥");
        p.setAge(21);
        //调用to String方法 打印输出属性值
        System.out.println(p.toString());
        //调用方法 （多态访问特点：访问方法：看子类 父类如存在 则编译通过）
        p.sleep();
        //调用子类特有方法:向下转型（强制类型转换）
        Dumb d = (Dumb) p;
        d.hear();
        d.eat();

        System.out.println("**********************************************************");

        //父类引用指向子类对象 （Deaf类）
        //利用有参构造给属性赋值 （多态访问特点：访问属性：看父类 父类如存在 则编译通过）
        Person p1 = new Deaf("粤利粤",22);
        //调用to String方法 打印输出属性值
        System.out.println(p1.toString());
        //调用方法 （多态访问特点：访问方法：看子类 父类如存在 则编译通过）
        p1.sleep();
        //调用子类特有方法:向下转型（强制类型转换）
        Deaf d1 = (Deaf) p1;
        d1.say();
        d1.eat();

    }
}


//定义一个父类Person类 类中有抽象方法 所以一定是抽象类
abstract class Person{
    //定义属性（成员变量） 姓名,年龄
     private String name;
     private int age;

    //定义无参构造
    public Person(){
        System.out.println("父类无参构造");
    }
    //定义有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //提供供外界访问的get（获取值） set（设置值）的方法
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

    //定义功能（成员方法）
    //共性功能:睡觉
    public void sleep(){
        System.out.println("睡大觉");
    }
    //共性抽象功能: show()  作用是描述自己是什么类,属性值是多少 抽象方法没有方法体 有抽象方法的类一定是抽象类
    public abstract void show();
}


//定义接口
//吃的接口   interface Eat {   吃的功能  } 接口关键字 interface
interface Eat{
    //接口方法一定是抽象方法 抽象方法没有方法体
    public abstract void eat();
}

//听的接口   interface  Hear{   听的功能}
interface Hear{
    //接口方法一定是抽象方法 抽象方法没有方法体 系统默认添加public abstract
    void hear();
}

//说的接口   interface Say{  说的功能}
interface Say{
    //接口方法一定是抽象方法 抽象方法没有方法体 系统默认添加public abstract
    void say();
}

//定义子类 继承父类 Person类
//哑巴类  Dumb  Person的子类 并实现Eat  Hear接口
class Dumb extends Person implements Eat,Hear{

    //子类无参构造
    public Dumb(){
        System.out.println("子类无参构造");
    }
    //子类有参构造
    public Dumb(String name, int age) {
        //super：父类对象引用
        super(name, age);
    }

    //子类必须重写父类中的抽象方法
    @Override
    public void show(){
        System.out.println();
    }
    //接口实现类必须重写接口中的抽象方法
    @Override
    public void eat(){
        System.out.println("哑巴在吃大碗宽面");
    }
    @Override
    public void hear(){
        System.out.println("哑巴在听不能说的秘密");
    }
    //子类重写to String方法 用于输出属性值
    @Override
    public String toString() {
        return "哑巴{" +
                "姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                '}';
    }
}

//聋子类  Deaf  Person 的子类 并实现Eat Say 接口
class Deaf extends Person implements Eat,Say{
    //子类无参构造
    public Deaf(){
        System.out.println("子类无参构造");
    }
    //子类有参构造
    public Deaf(String name, int age) {
        //super：父类对象引用
        super(name, age);
    }

    //子类必须重写父类中的抽象方法
    public void show(){
        System.out.println();
    }
    //接口实现类必须重写接口中的抽象方法
    public void eat(){
        System.out.println("聋子在吃鸡蛋灌饼");
    }
    public void say(){
        System.out.println("聋子说再给我两分钟");
    }
    //子类重写to String方法 用于输出属性值
    @Override
    public String toString() {
        return "聋子{" +
                "姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                '}';
    }
}
