package com.atguigu;

/*
 内部类
    1.如何创建一个内部类
    2.内部类如何访问外部类成员/外部如何访问内部类成员

    静态成员内部类
         1.在静态内部类中只能访问外部类的静态成员(包含私有的)
         2.在其他类中创建内部类对象:
            格式:外部类名.内部类名 对象名 = new 外部类名.内部类名();
         3.在外部类中想要访问静态内部类的成员时
            如果是静态成员,使用静态内部类类名.成员
            如果是非静态成员,使用静态内部类对象名.成员
         4.内部类如何访问外部类的成员
            只能访问外部类的静态成员
            如果成员变量重名,优先访问本类的成员,需要调用外部类的,使用外部类类名/对象名.调用

    就近原则  静态原则(静态的只能访问静态的)

 */
public class Demo3 {
    public static void main(String[] args) {
        Waibu.Neibu wn = new Waibu.Neibu();
        wn.Method();
    }
}
//外部类
class Waibu{
    //定义属性（成员变量）
    private static String a = "外部类静态成员变量 a ";
    private static String b = "外部类静态成员变量 b ";
    static class Neibu{  //静态成员内部类 由static修饰
        static String c = "内部类静态成员变量";
        String a = "内部类非静态成员变量";
        //定义方法
        public static void staticMethod(){  //静态方法
            System.out.println(b); //静态的只能访问静态的
            //System.out.println(a); // 报错 就近原则 静态的只能访问静态的 最近的一个是a非静态的
            System.out.println(c);
        }
         public void Method(){  //非静态方法
             System.out.println(a);
             System.out.println(c);
         }
    }
}
