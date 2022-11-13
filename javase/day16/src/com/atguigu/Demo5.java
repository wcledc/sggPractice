package com.atguigu;

public class Demo5 {
    public static void main(String[] args) {
        Car<String> c = new Car<>();
        c.setElement("X6M");
        c.setElement("M3");
        System.out.println("Dream car: " + c.getElement());

        System.out.println("************************************");

        Car<Integer> c2 = new Car<>();
        c2.setElement(1200000);
        System.out.println("价格: " + c2.getElement());

    }
}

//定义一个泛型类 格式: 修饰符 类名<>
class Car<C>{
    //有泛型成员的类一定是泛型类
    private C element;

    public C getElement() {
        return element;
    }

    public void setElement(C element) {
        this.element = element;
    }
}
