package homework.work3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("homework.work3.Pig");

        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class,int.class);

        Object o = declaredConstructor.newInstance("佩奇", 8);

        System.out.println(o);

        //通过字节码文件对象创建方法对象
        Method name = c.getDeclaredMethod("getName");

        Object invoke = name.invoke(0);
        System.out.println(invoke);
    }
}
