package reflect.demo2;

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取Class字节码文件对象
        Class<?> c1 = Class.forName("reflect.demo2.Student");
        //通过字节码文件对象获取私有有参构造器对象
        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(int.class);
        //暴力反射 屏蔽掉private私有
        declaredConstructor.setAccessible(true);
        //通过构造器对象创建student对象
        Object o = declaredConstructor.newInstance(14);

        System.out.println(o);
    }
}
