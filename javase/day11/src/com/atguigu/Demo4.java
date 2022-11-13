package com.atguigu;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.toString());
        System.out.println(Season.SUMMER.toString());
        System.out.println(Season.AUTUMN.toString());
        System.out.println(Season.WINTER.toString());
    }
}
//定义枚举类 季节类 枚举关键字：enum
enum Season{
    //枚举类的实例对象是固定的 不能随意创建
    //枚举类的实例对象列表必须写在枚举类的首行，并且建议大写(因为是常量)
    //通过有参构造创建
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");
    //定义属性
    private String name;
    //枚举类可以是无参构造也可以是有参构造， 但是默认提供无参构造， 枚举类的构造器一定是private（私有的）
    //定义有参构造 枚举类的构造器一定是private（私有的）
    private Season(String name){
        this.name = name;
    }
    //重写to String方法
    //枚举类的to String方法 默认输出实例对象（常量）名
    //枚举类重写了Object的toString方法,默认返回的是常量名(可以再次重写,返回属性值)
    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
