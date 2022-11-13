package homework.work1;

import java.lang.reflect.Constructor;

public class Test1 {
    public static void main(String[] args) throws Exception {

        //通过.forName()获取字节码文件对象
        Class<?> c = Class.forName("homework.work1.Dog");

        //通过字节码文件对象获取构造器对象
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class,int.class);

        //暴力反射 屏蔽构造器的private
        declaredConstructor.setAccessible(true);

        //通过构造器对象创建Dog类对象
        Object o = declaredConstructor.newInstance("圆圆",3);
        System.out.println(o);

    }
}
