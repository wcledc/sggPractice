package homework.work2;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*Stream接口
       !!!注意:Stream流对象只能使用唯一的一次,如果想再次进行使用,需要重新进行获取
         *      接口的特点
         *          可以针对容器中的数据进行高效操作的流对象
         *      接口的位置
         *          java.util.stream
         *      接口的方法
         *          static <T> Stream<T> of(T... values)
        *              返回一个元素为指定值的顺序排列的流。
        *          long count()
        *              返回此流中元素的计数
        *          void forEach(Consumer<? super T> action)
        *              对该流的每个元素执行一个动作。
        *          static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
        *              创建一个懒洋洋的级联流的元素的所有元素的第一流通过第二个流的元素。
        *          Stream<T> filter(Predicate<? super T> predicate)
        *              返回由该流的元素组成的流，该元素与给定的谓词匹配。
        *          <R> Stream<R> map(Function<? super T,? extends R> mapper)
        *              返回一个流，包括将给定函数应用到该流元素的结果。
        *          Stream<T> limit(long maxSize)
        *              返回一个包含该流的元素流，截断长度不超过 maxSize。
        *          Stream<T> skip(long n)
        *              返回一个包含此流的其余部分丢弃的流的第一 n元素后流。*/
public class Work2 {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> s1 = Stream.of("叶湘伦","叶惠美","路小雨","高桥凉介");
        //long count()返回流对象中元素的个数
        //System.out.println(s1.count());
        //void forEach(Consumer<? super T> action)遍历流对象中的每一个元素
        s1.forEach(s -> System.out.println(s));

        System.out.println("====================================================");

        //创建一个Stream流对象
        Stream<String> s2 = Stream.of("叶湘伦","叶惠美","路小雨","高桥凉介");
        Stream<Object> s3 = Stream.of("迪迦","赛文","泰罗");
//        static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
//        将两个对象合并成一个新的流对象
        Stream.concat(s2,s3).forEach(s-> System.out.println(s));

        System.out.println("====================================================");

        //创建一个Stream流对象
        Stream<String> s4 = Stream.of("叶湘伦","叶惠美","路小雨","高桥凉介");
//        Stream<T> filter(Predicate<? super T> predicate)
//        返回Stream流对象的元素与给定的谓词（形容词）匹配
        s4.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回一个名字为4位的元素
                return s.length() == 4;
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("====================================================");

        //创建一个Stream流对象
        Stream<String> s5 = Stream.of("333","444","222");
//        <R> Stream<R> map(Function<? super T,? extends R> mapper)
//        将流对象中的字符串转化为int类型
        s5.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));

        System.out.println("====================================================");

        //创建一个Stream流对象
        Stream<String> s6 = Stream.of("叶湘伦","叶惠美","路小雨","高桥凉介");
//        Stream<T> limit(long maxSize)
//        将对象中的元素进行截取
        s6.limit(3).forEach(s-> System.out.println(s));

        System.out.println("====================================================");

        //创建一个Stream流对象
        Stream<String> s7 = Stream.of("叶湘伦","叶惠美","路小雨","高桥凉介");
//        Stream<T> skip(long n)
//        跳过指定元素
        s7.skip(2).forEach(s -> System.out.println(s));
    }
}
