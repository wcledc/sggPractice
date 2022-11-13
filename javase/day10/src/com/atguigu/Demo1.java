package com.atguigu;
/*需求:
        定义一个父类Animal类
        共性功能为eat(),此功能要求每个动物类都具备,但具体实现交给子类
        共性功能sleep(),此功能让所有子类继承即可

        子类:猫类
        行为
        吃饭:实现父类eat()方法,具体吃饭方式为:"小猫爱吃草"
        抓老鼠:特有的功能

        子类:狗类
        行为
        吃饭:实现父类eat()方法,具体吃饭方式为:"小狗爱吃肉"
        抓老鼠:特有的功能*/
public class Demo1 {
    public static void main(String[] args) {
        //抽象类不能（实例化）创建对象
        //Animal a = new Animal();(报错）
        //创建子类猫类对象
        Cat c = new Cat();
        //调用方法
        c.eat();
        c.hunted();
        c.sleep();
        System.out.println("*************************************");
        //创建子类狗类对象
        Dog d = new Dog();
        //调用方法
        d.eat();
        d.hunted();
        d.sleep();
    }
}


//定义一个父类Animal类 类中含有抽象方法 此类一定是抽象类 由abstract修饰
abstract class Animal{
    //共性功能为eat(),此功能要求每个动物类都具备,但具体实现交给子类
    //定义方法 父类提供功能 具体实现细节交给子类 为抽象方法 由abstract修饰 抽象方法只有方法签名 没有方法体
    public abstract void eat();
    //共性功能sleep(),此功能让所有子类继承即可
    //普通方法
    public void sleep(){
        System.out.println("动物在睡觉");
    }
}

/*子类:猫类
        行为
        吃饭:实现父类eat()方法,具体吃饭方式为:"小猫爱吃草"
        抓老鼠:特有的功能*/
class Cat extends Animal{
    //子类必须重写父类抽象方法 实现具体细节
    @Override
    public void eat(){
        System.out.println("小猫爱吃草");
    }
   //抓老鼠:特有的功能
    public void hunted(){
        System.out.println("小猫在捉老鼠");
    }
}

 /*子类:狗类
         行为
         吃饭:实现父类eat()方法,具体吃饭方式为:"小狗爱吃肉"
         抓老鼠:特有的功能*/
class Dog extends Animal{
    //子类必须重写父类抽象方法 实现具体细节
    @Override
     public void eat(){
        System.out.println("小狗爱吃肉");
    }
     //抓老鼠:特有的功能
     public void hunted(){
         System.out.println("狗拿耗子，多管闲事");
     }
 }
