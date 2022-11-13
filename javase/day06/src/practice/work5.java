package practice;

public class work5 {
    public static void main(String[] args) {
        //创建对象  类名 对象名 = new 类名();
        Cat c = new Cat();
        //调用对象给属性赋值
        c.age = 3;
        c.name = "大黄";
        c.breed = "胖橘";
        //打印输出
        System.out.println("我是一只:"+ c.breed + ",我叫:"+ c.name + ",我今年:"+c.age);
        //调用方法
        c.predator();
        c.sleep();
    }
}
//创建一个猫类
class Cat{
    //定义属性（成员变量） 年龄 姓名 品种
    int age;
    String name;
    String breed;
    //定义方法（功能) 猫在捉老鼠 猫在睡觉
    public void predator(){
        System.out.println("大黄在捉老鼠");
    }
    public void sleep(){
        System.out.println("大黄在睡觉");
    }

}
