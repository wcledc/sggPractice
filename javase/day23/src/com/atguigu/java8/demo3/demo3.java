package com.atguigu.java8.demo3;
/*方法引用(了解):
        *      含义:
        *          针对符合条件的Lambda表达式进一步的简化语法
        *      分类:
        *          成员方法引用
        *              实例方法引用
        *              静态方法引用
        *          构造方法引用
        *              对象引用
        *              数组引用
        *      前提:
        *          1.代码必须可以编写成Lambda表达式的格式
        *          2.Lambda表达式中不能有{}
        *          3.Lambda表达式->前的形参和->后的方法调用时的实参个数和数据类型必须一样
        *
        * 方法引用的格式:
        *      实例方法:
        *          Lambda表达式格式:
        *              (参数名) -> 对象名.实例方法名(参数名);
        *          方法引用格式:
        *              对象名::实例方法名
        *      静态方法:
        *          Lambda表达式格式:
        *              (参数名) -> 类名.静态方法名(参数名);
        *          方法引用格式:
        *              类名::静态方法名;
        *      对象引用:
        *          Lambda表达式格式:
        *              (参数) -> new 类名(参数);
        *          方法引用格式:
        *              类名::new
        *      数组引用:
        *          Lambda表达式格式:
        *             长度变量名 -> new 数据类型[长度变量名];
        *          方法引用格式:
        *              数据类型[]::new*/
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
/*Stream流对象的常用方法
        *      注意:Stream流对象只能使用唯一的一次,如果想再次进行使用,需要重新进行获取*/
public class demo3 {
    public static void main(String[] args) {
        //创建Stream对象
        Stream<Object> s1 = Stream.of("喜羊羊","懒羊羊","沸羊羊");
        //遍历获取对象元素
        //lamdan表达式
        //s1.forEach(s -> System.out.println(s));

        //方法引用
        s1.forEach(System.out :: println);
        System.out.println("*************************************");

        //创建Stream对象
        Stream<String> s2 = Stream.of("33","22","11");
        //将对象中的元素转换成int类型
        //s2.map(s -> Integer.parseInt(s)).forEach(System.out ::println);
        //方法引用
        s2.map(Integer :: parseInt).forEach(System.out ::println);

        System.out.println("************************************");

        //getObject(() -> new Student());
        getObject(Student ::new);

        System.out.println("*******************************************");

        //getArray(length -> new String[length],3);
        getArray(String[] ::new,3);

    }
    public static void getObject(Supplier<Student> supplier){
        Student s = supplier.get();
        System.out.println(s);
    }

    public static void getArray(Function<Integer,String[]> function,int length){
        String[] arr = function.apply(length);
        System.out.println(arr);
    }
}
