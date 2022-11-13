package com.atguigu;

public class Demo3 {
    public static void main(String[] args) {
        //通过构造器创建对象
        Phone14 p14 = new Phone14();
        p14.brand = "华为";
        p14.colour = "黑色";
        p14.price = 3400;
        //System.out.println("品牌: " + p14.brand + "颜色: " + p14.colour + "价格: " + p14.price);
        System.out.println(p14.toString());
        p14.call();
        p14.games();
        p14.sendMessage();
    }
}
//定义一个父类 1代手机类
class Phone1{
    //定义属性
    String brand;
    double price;

    //无参构造
    public Phone1(){
        System.out.println("***无参构造***");
    }
    //有参构造
    public Phone1(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //定义方法
    public void call(){
        System.out.println("手机只能打语音电话");
    }
    public void sendMessage(){
        System.out.println("手机发短信");
    }
}
//定义子类 14代手机
class Phone14 extends Phone1{
    //定义属性
    String colour;
    //子类重写父类的方法
    /*方法重载与方法重写的区别:
    方法重载：在同一个类中，方法名相同，形参列表不同，与返回值无关。范围：在同一个类中
    方法重写：在子父类中，父类的方法无法满足子类的需求，子类对其进行重写。范围：在子父类中*/
    @Override //方法重写:父类的方法无法满足子类的需求 子类对其进行重写 范围:在子父类中
    public void call(){
        System.out.println("手机现在能打语音也可以打视频");
    }
    public void games(){
        System.out.println("手机可以打游戏");
    }
    //子类重写to String方法 用于显示属性值
    @Override
    public String toString() {
        return "Phone14{" +
                "颜色='" + colour + '\'' +
                ", 品牌='" + brand + '\'' +
                ", 价格=" + price +
                '}';
    }
}
