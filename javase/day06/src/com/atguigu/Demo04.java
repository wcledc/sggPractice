package com.atguigu;
/*分析
        - 把大象关冰箱分几步?
        三步 :1 打开冰箱, 2.把大象放进去 3.关闭冰箱
        - 这个过程涉及到几个事物?
        大象 (属性:姓名,年龄  功能: 吃饭 睡觉)
        冰箱(属性: 品牌,价格 功能:打开 ,盛放(大象的类型  变量) 关闭)*/
public class Demo04 {
    public static void main(String[] args) {
        //打开冰箱
        IceBox ib = new IceBox();
        ib.opean();
        //将大象放入冰箱
        Elephant lucky = new Elephant();
        lucky.name = "QQ";
        lucky.age = 14;
        ib.put(lucky);
        //关闭冰箱
        ib.close();



    }
}
//
class Elephant{
    //成员变量（属性） 姓名，年龄
    String name;
    int age;

    //成员方法（功能） 吃 睡
    public void eat(){
        System.out.println("大象在吃香蕉");
    }
    public void sleep(){
        System.out.println("大象在睡觉");
    }
}
class IceBox{
    String brand;
    int price;

    public void opean(){
        System.out.println("打开冰箱");
    }
    public void put(Elephant lucky){
        System.out.println("装入的大象名,姓名为"+ lucky.name + ",年龄为：" + lucky.age);
    }
    public void close(){
        System.out.println("关闭冰箱");
    }
}
