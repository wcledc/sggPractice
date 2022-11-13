package homework.work2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("homework.work2.Cat");

        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class,int.class);

        Object o = declaredConstructor.newInstance("小灰灰",3);

        System.out.println(o);

        //通过字节码文件对象创建属性对象
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        //改变属性值
        name.set(o,"大灰灰");
        System.out.println("姓名：" + name.get(o));
    }
}
