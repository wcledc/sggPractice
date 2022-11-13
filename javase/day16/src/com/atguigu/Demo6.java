package com.atguigu;

/*
    一个接口  泛型的确认时机: 创建子类对象时
 */
public class Demo6 {
    public static void main(String[] args) {
        BookImp<String> bookImp = new BookImp<>();
        bookImp.method("海边的曼彻斯特");

        BookImp2 bookImp2 = new BookImp2();
        bookImp2.method(1299);

    }
}

//定义一个接口
// 自定义 带有泛型的接口  定义时 不确定类型  等到实例化才能确定  泛型
interface Book<E>{
    //有泛型方法的接口一定是泛型泛型接口
    void method(E e);
    }

//定义一个实现类
//实现类没有确定具体的数据类型
// 定义时 不确定类型   等到实例化才能确定  泛型
class BookImp<E> implements Book<E>{

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

//定义一个实现类
//有具体的数据类型
// 定义实现类时  确认了 泛型的类型
class BookImp2 implements Book<Integer>{

    @Override
    public void method(Integer i) {
        System.out.println("i");
    }
}

