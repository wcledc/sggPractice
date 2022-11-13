package homework.work1;
/*StreamAPI:
      含义：可以针对容器中的数据进行高效操作的流对象
      分类：中间操作：（延迟操作）
            方法的返回类型是Stream类型的方法
            终结操作：
            方法的返回类型不是Stream类新的方法*/
/*Stream对象获取的方法(常用3种):
        *      通过集合对象进行获取
        *          单列集合对象名.stream()
        *      通过Arrays数组工具类进行获取
        *          Arrays.stream(数组名)
        *      通过Stream直接进行获取
        *          Stream.of(元素1,元素2,......,元素n)
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Work1 {
    public static void main(String[] args) {
        //创建Stream流对象
        //1.通过集合对象进行获取 前提：只能是单例集合 双例不行
        //创建集合对象
        ArrayList<Object> list = new ArrayList<>();
        //批量添加集合元素
        Collections.addAll(list,"叶湘伦","叶惠美","路小雨","jay");
        //获取集合长度
        System.out.println(list.size());
        System.out.println(list);
        //通过集合对象获取Stream对象
        Stream<Object> s1 = list.stream();
        System.out.println(s1);

        System.out.println("====================================================");

        //通过数组进行获取
        //创建数组
        String[] arr = {"喜羊羊","懒羊羊","沸羊羊"};
        //通过数组Arrays工具类进行获取Stream对象
        Stream<String> s2 = Arrays.stream(arr);
        System.out.println(s2);

        System.out.println("====================================================");

        //通过Stream.of直接进行获取
        //通过Stream直接进行获取
        //Stream.of(元素1,元素2,......,元素n)
        Stream<Object> s3 = Stream.of("迪迦","赛文","泰罗");
        //System.out.println(s3);
        //调用forEach方法对Stream对象中的元素进行遍历
        s3.forEach(s -> System.out.println(s));
    }
}
