package practice;

import java.math.BigDecimal;

public class work1 {
    public static void main(String[] args) {
        int[] arr = {21,34,23,56,76,89};

       // System.out.println(getSum(arr));//调用方法打印输出
        //System.out.println(getAvg(arr));
        //System.out.println(getMax(arr));
        //System.out.println(getMin(arr));
        System.out.println(getProduct(arr));
        System.out.println(getProduct2(arr));
        System.out.println(getProduct3(arr));
        System.out.println(getProduct4(arr));
        //revArr(arr);
        //print(arr);
        //sortArr(arr);
        //print1(arr);
    }
//    求和
    public static int getSum(int[] arr){
        //定义变量 表示数组的和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //求和
            sum += arr[i];
        }
        //返回值
        return sum;
    }
//    求平均值
    public static int getAvg(int[] arr){
        //数组整和除以数组长度
        int avg = getSum(arr)/arr.length;
        return avg;
    }
//     求最大值
    public static int getMax(int[] arr){
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    //求最小值
    public static int getMin(int[] arr){
        int Min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] < Min){
                Min = arr[i];
            }
        }
        return Min;
    }
    //求乘积
    public static int getProduct(int[] arr){
        int Product = 1;
        for (int i = 0; i < arr.length; i++) {
            Product *= arr[i];
        }
        return Product;
    }

    //求乘积
    public static long getProduct2(int[] arr){
        long Product = 1;
        for (int i = 0; i < arr.length; i++) {
            Product *= arr[i];
        }
        return Product;
    }

    //求乘积
    public static double getProduct3(int[] arr){
        double Product = 1;
        for (int i = 0; i < arr.length; i++) {
            Product *= arr[i];
        }
        return Product;
    }

    //求乘积
    public static BigDecimal getProduct4(int[] arr){
        BigDecimal Product = new BigDecimal(1);
        for (int i = 0; i < arr.length; i++) {
            Product = Product.multiply(BigDecimal.valueOf(arr[i]));
        }
        return Product;
    }

    //数组反转
    public static void revArr(int[] arr){
        int Max = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[Max - i];
            arr[Max - i] = temp;
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    //偶数个数
   /* public static int even(int[] arr){
        int count = 0;
        for (int i = 0; i < ; i++) {
            
        }
    }*/
   //冒泡排序
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void print1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
