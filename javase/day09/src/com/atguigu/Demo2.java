package com.atguigu;
/*多态前提：1.继承  2.方法重写  3.父类引用指向子类对象*/
/*
多态的成员访问特点
     编译：看父类是否存在，如果存在则编译通过。
     运行：
         1.成员变量（属性）：看父类
          2.成员方法（方法）：看子类 （因为子类重写覆盖了父类方法）
*/
 /*多态的弊端：
         不能访问子类的特有的方法  要访问 需转型
         向上转型 (隐式转换)  小 -- > 大
         向下转型(强制转换)  大 -- > 小*/
public class Demo2 {
    public static void main(String[] args) {
        //父类引用指向子类对象   形成多态
        Person p = new Ultraman();
        //访问属性: 父类
        System.out.println(p.name);
        System.out.println(p.age);
        //调用方法: 子类
        p.sleep();
        p.eat();
        //p.fly();   父类不存在该方法 无法调用
        //Person 大 ==> Ultraman  小；
        //大 -> 小 强转  目标类型 变量名 = （目标类型）变量值；
        Ultraman ut = (Ultraman)p;
        ut.fly();
    }
}
//创建父类 人类
class  Person{
    //定义属性
    String name = "大古";
    int age = 18;

    //定义方法
    public void eat(){
        System.out.println("大古在吃饭");
    }
    public void sleep(){
        System.out.println("大古在睡觉");
    }
}

//定义子类 超人类
class Ultraman extends Person{
    //定义属性
    String name = "迪迦";
    int age = 100000;
    int height = 180000;

    //子类重写父类的方法
    public void eat(){
        System.out.println("迪迦在吃怪兽");
    }
    public void sleep(){
        System.out.println("迪迦在补充能量");
    }
    public void fly(){
        System.out.println("迪迦在飞翔");
    }
}

