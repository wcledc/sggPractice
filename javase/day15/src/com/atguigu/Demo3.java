package com.atguigu;
 /*
        public static double abs(double a) ` ：返回 double 值的绝对值。
        public static double ceil(double a)` ：返回大于等于参数的最小的整数。(天花板,向上取整)
        public static double floor(double a) ` ：返回小于等于参数最大的整数。(地板,向下取整)

        public static long round(double a)` ：返回最接近参数的 long。(类似于四舍五入方法)
        public static double pow(double a,double b)：返回a的b幂次方
        public static double sqrt(double a)：返回a的平方根(开平方)

        public static double random()：返回[0,1)的随机值
        public static final double PI：返回圆周率
        public static double max(double x, double y)：返回x,y中的最大值
        public static double min(double x, double y)：返回x,y中的最小值
     */
import org.testng.annotations.Test;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
//        public static double abs(double a) ` ：返回 double 值的绝对值。
        System.out.println(Math.abs(60));
//        public static double ceil(double a)` ：返回大于等于参数的最小的整数。(天花板,向上取整)
        System.out.println(Math.ceil(18.5));
//        public static double floor(double a) ` ：返回小于等于参数最大的整数。(地板,向下取整)
        System.out.println(Math.floor(13.2));
    }

    @Test
    public void Test1(){
//        public static long round(double a)` ：返回最接近参数的 long。(类似于四舍五入方法)
        System.out.println(Math.round(23.7));
//        public static double pow(double a,double b)：返回a的b幂次方
        System.out.println(Math.pow(6, 3));
//        public static double sqrt(double a)：返回a的平方根(开平方)
        System.out.println(Math.sqrt(36));
    }

    @Test
    public void Test2(){
//        public static double random()：返回[0,1)的随机值
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
//        public static final double PI：返回圆周率
        System.out.println(Math.PI);
//        public static double max(double x, double y)：返回x,y中的最大值
        System.out.println(Math.max(67, 24));
//        public static double min(double x, double y)：返回x,y中的最小值
        System.out.println(Math.min(67, 57));
    }
}
