package com.atguigu.reflect.demo1;
/*反射其实是Java初级通向Java高级的桥梁
        *      Java初级:
        *          具备JavaSE开发水准,并且可以熟练分析Java API的源码
        *      Java高级
        *          具备JavaEE开发水准,并且可以熟练分析Java相关框架和插件源码
        *
        * 反射学习目的:
        *      1.封装工具类
        *      2.理解后期插件或软件的解析过程
        *          例如:xml解析...
        *      3.分析框架或插件源码
        *
        * 反射的含义:
        *     从简单的维度讲:
        *          反射就是创建和使用对象的另外一种方式
        *     从复杂的维度讲:
        *          需要将原本new的强类型对象,通过反射创建弱类型对象
        *
        * 强类型对象和弱类型对象的区别:
        *      在堆内存中的差异:强类型对象通过new进行创建,随着对象的创建而加载,当对象和其它内存区域没有任何关联的时候,强类型对象会被JVM认定
        *      为垃圾数据,等待垃圾回收器的回收,在一定程度上会浪费堆内存中使用率;弱类型对象也是随着对象的创建而加载,但对象使用完毕立刻在堆内
        *      存中消失,从而节约堆内存的使用率
        * 获取Class对象的四种方式
 *      1.通过类名.class方式进行获取
 *      2.通过Object类的实例方法getClass()
 *      3.通过Class类的静态方法forName(); 推荐
 *      4.通过ClassLoader类的静态方法getSystemClassLoader()和实例方法loadClass()*/
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象的四种方式
        //1.通过类名.class方式进行获取
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        //2.通过Object类的实例方法getClass（）
        Class<? extends Student> c2 = new Student().getClass();
        System.out.println(c2);

        //3.通过Class的静态方法forname()
        Class<?> c3 = Class.forName("com.atguigu.reflect.demo1.Student");
        System.out.println(c3);

        Class<?> c4 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.reflect.demo1.Student");
        System.out.println(c4);
    }
}
