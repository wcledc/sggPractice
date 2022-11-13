package com.atguigu;

/*
    泛型定义在方法上

    格式
        修饰符 <泛型类型> 返回值类型  方法名(泛型类型 变量名){
        }

        1> 如果 一个实例方法的泛型和当前类的泛型是一致的,
            那么 <泛型类型> 是可以省略的(  修饰符 <泛型类型> 返回值类型)
        2> 如果 一个实例方法的泛型和当前类的泛型是不一致的,
            那么 <泛型类型> 是不可以省略的
        3> 如果一个静态方法,定义时 泛型的确认时机和类的泛型确认时机 不一样,推荐使用不同的泛型类型
 */
public class Demo7 {
    public static void main(String[] args) {
        Test<String> tt1 = new Test<>();
        tt1.method1("一路向北");

        Test<Integer> tt2 = new Test<>();
        tt2.method2("不能说的秘密");

        Test<Object> tt3 = new Test<>();
        tt3.method3(500);
    }
}

//格式
//        修饰符 <泛型类型> 返回值类型  方法名(泛型类型 变量名){
//        }
class Test<X>{
    // 默认和当前的类的泛型是一致的  修饰符和返回值 之间<类型> 可以省略
    public void method1(X x){
        System.out.println(x);
    }

    // 如果方法的声明中 出现了类不一致的泛型类型 那么 <类型> 不能省略
    public <C> void method2(C c){
        System.out.println(c);
    }

    // 静态方法  泛型的确认时机 和类的泛型的确认时机是不同的
    // 推荐 静态方法 泛型使用和类的泛型类型不一致
    // 如果 静态方法  泛型使用和类的泛型类型 书写一致时,运行时 也是会当做两个不同的类进行加载
    public static <S> void method3(S s){
        System.out.println(s);
    }
}
