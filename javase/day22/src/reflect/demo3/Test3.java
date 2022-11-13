package reflect.demo3;
/*
通过反射创建对象并使用其属性
        *
        * Field类
        *      类的特点
        *          Field 提供有关类或接口的单个字段的信息，以及对它的动态访问权限
        *      类的位置
        *          java.lang.reflect
        *      类的构造器
        *          构造器私有化,通过字节码文件对象进行获取
        *      类的方法
        *          public void setAccessible(boolean flag)
        *              将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
        *              值为 false 则指示反射的对象应该实施 Java 语言访问检查。
        *          public void setXxx(Object obj,xxx basicVar)
        *              将字段的值设置为指定对象上的一个 "基本类型"的 值。(Xxx对应的基本类型单词)
        *          public void set(Object obj,Object value)
        *              将指定对象变量上此 Field 对象表示的字段设置为指定的新值
        *          public xxx getInt(Object obj)
        *              获取 xxx 类型或另一个通过扩展转换可以转换为 xxx 类型的基本类型的静态或实例字段的值。(xxx对应的基本类型单词)
        *          public Object get(Object obj)
        *              返回指定对象上此 Field 表示的字段的值。
*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test3 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class<?> c2 = Class.forName("reflect.demo3.Student");


        //获取有参构造器对象
        Constructor<?> declaredConstructor = c2.getDeclaredConstructor(String.class,int.class);

        //通过构造器对象创建student对象
        Object o = declaredConstructor.newInstance("叶惠美", 24);

        //通过字节码文件对象获取name属性对象
        Field name = c2.getDeclaredField("name");
        //暴力反射 屏蔽属性的private
        name.setAccessible(true);
        //获取学生对象的name属性
        System.out.println(name.get(o));

    }
}
