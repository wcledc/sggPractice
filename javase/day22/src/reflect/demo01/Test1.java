package reflect.demo01;

import java.lang.reflect.Constructor;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //创建Class字节码文件对象
        Class<?> c = Class.forName("reflect.demo01.Student");

        //通过字节码文件对象获取有参构造器对象                              //有参构造器参数类型.class
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class,int.class);

        //通过构造器对象创建Student对象
        Object o = declaredConstructor.newInstance("叶湘伦",20);

        System.out.println(o);


    }
}
