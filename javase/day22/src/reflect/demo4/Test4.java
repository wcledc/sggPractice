package reflect.demo4;
/*通过反射创建对象并调用方法
        *
        * Method类
        *      类的特点
        *          Method 提供关于类或接口上单独某个方法（以及如何访问该方法）的信息。
        *      类的位置
        *          java.lang.reflect
        *      类的构造器
        *          构造器私有化,通过Class对象进行获取
        *      类的方法
        *          public void setAccessible(boolean flag)
        *              将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
        *              值为 false 则指示反射的对象应该实施 Java 语言访问检查。
        *          public Object invoke(Object obj,Object... args)
        *              对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<?> c = Class.forName("reflect.demo4.Student");

        //通过字节码对象获取有参构造器对象
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class,int.class);

        //通过构造器对象创建Student对象
        Object o = declaredConstructor.newInstance("jay",21);

        //通过字节码对象创建get name方法对象
        Method getname = c.getDeclaredMethod("getName");
        //通过get name对象调用方法
        Object invoke = getname.invoke(o);
        System.out.println(invoke);

        //通过Student类的Class对象获取指定setAge方法对象
        Method setAge = c.getDeclaredMethod("setAge", int.class);
        //通过setAge对象进行调用
        setAge.invoke(o,18);
        System.out.println(o);

    }
}
