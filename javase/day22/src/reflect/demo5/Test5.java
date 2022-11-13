package reflect.demo5;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
 /*Array类
         *      类的特点
         *          Array 类提供了动态创建和访问 Java 数组的方法。
         *      类的位置
         *          java.lang.reflect
         *      类的构造器
         *          构造器私有化,通过静态方法获取
         *      类的方法
         *          public static Object newInstance(Class<?> componentType,int length)
        *              创建一个具有指定的组件类型和长度的新数组。
        *          public static void setXxx(Object array,int index,xxx basicVar)
        *              将指定数组对象中索引组件的值设置为指定的 xxx 值。(xxx代表基本类型的单词)
        *          public static void set(Object array,int index,Object value)
        *              将指定数组对象中索引组件的值设置为指定的新值。
        *          public static xxx getXxx(Object array,int index)
        *              以 xxx 形式返回指定数组对象中索引组件的值。 (xxx代表基本类型的单词)
        *          public static int getLength(Object array)
        *              以 int 形式返回指定数组对象的长度。
        *
        * 通过反射创建数组并遍历*/
public class Test5 {
    public static void main(String[] args) throws Exception {
        //通过反射创建长度为3的int类型数组
        Object arr1 = Array.newInstance(int.class,3);
        //添加元素
        Array.set(arr1,0,33);
        Array.set(arr1,1,22);
        Array.set(arr1,2,11);
        //遍历数组
        for (int i = 0; i < Array.getLength(arr1); i++) {
            System.out.println(Array.get(arr1, i));
        }
        System.out.println("******************************");

        //通过反射创建长度为3的String类型数组
        Object arr2 = Array.newInstance(String.class, 3);
        
        Array.set(arr2,0,"c");
        Array.set(arr2,1,"b");
        Array.set(arr2,2,"a");

        for (int i = 0; i < Array.getLength(arr2); i++) {
            System.out.println(Array.get(arr2, i));
        }
        System.out.println("******************************");


        //通过反射创建长度为3的Student类型数组
        Object arr3 = Array.newInstance(Student.class,3);

        //获取字节码文件对象
        Class<?> c = Class.forName("reflect.demo5.Student");
        //通过字节码文件对象 获取有参构造器对象
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        //通过构造器对象创建Student对象
        Object stu1 = declaredConstructor.newInstance("高桥凉介",18);
        Object stu2 = declaredConstructor.newInstance("藤原拓海",20 );
        Object stu3 = declaredConstructor.newInstance( "中里毅",23);
        //将学生对象存储到数组中
        Array.set(arr3,0,stu1);
        Array.set(arr3,1,stu2);
        Array.set(arr3,2,stu3);
        //遍历数组
        for (int i = 0; i < Array.getLength(arr3); i++) {
            System.out.println(Array.get(arr3, i));
        }
    }
}
