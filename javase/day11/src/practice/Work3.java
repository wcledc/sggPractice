package practice;

import java.security.PublicKey;

public class Work3 {
    public static void main(String[] args) {
        //定义一个int型数组
        int[] arr = {23, 45, 89, 76, 34, 13};
        //调用方法 并打印输出
        System.out.println(getMax(arr));
        //调用方法 并打印输出
        System.out.println(getMin(arr));
        //调用方法 并打印输出
        System.out.println(getSum(arr));
        //调用方法 并打印输出
        sortArr(arr);
        print(arr);
        //求数组下标值
        //System.out.println(arr.length-1);
        //遍历数组 得到数组元素中的每一个数
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }
    //求最大值
    //定义一个返回值类型为int 参数列表为int[] arr的方法
    public static int getMax(int[] arr){
        //假设第一个下标元素最大
        int Max = arr[0];
        //遍历数组 让每个数都与第一个数作比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max){
                //比较出来的最大值赋给Max
                Max = arr[i];
            }
        }
        return Max; //返回结果 最大值
    }

    //最小值
    //定义一个返回值类型为int 参数列表为int[] arr的方法
    public static int getMin(int[] arr){
        //假设第一个下标元素值最小
        int Min = arr[0];
        //遍历数组 让每个数与第一个数作比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min){
                //比较出来的最小值赋给Min
                Min = arr[i];
            }
        }
        return Min;  //返回结果 最小值
    }

    //求和
    //定义一个返回值类型为int 参数列表为int[] arr的方法
    public static int getSum(int[] arr){
        //定义一个int型变量 初始化为0
        int sum = 0;
        //遍历数组 得到数组中的每一个元素值
        for (int i = 0; i < arr.length; i++) {
            //累加数组中的每个元素值 赋给sum
            sum += arr[i];
        }
        return sum;
    }

    //求平均值
    //定义一个返回值类型为int 参数列表为int[] arr的方法
    public static int getAvg(int[] arr){
        //定义一个int型变量 初始化为0；
        int Avg = 0;
        // 数组和除以数组长度
        Avg = getSum(arr)/arr.length;
        //返回结果
        return Avg;
    }

    //冒泡排序
    //定义无返回值类型 参数列表为 int[] arr 的方法
    public static void sortArr(int[] arr){
        //外层循环控制一共比较多少轮 6个元素 比较5轮 数组长度（arr.length-1）轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环每轮比较的次数 每比较一轮得出一个最大值 少比一个 （arr.length-1-i)
            for (int j = 0; j < arr.length-1-i; j++) {
                //比较内容 arr[j]  arr[j+1]  比较条件 前 > 后 则交换
                if (arr[j] > arr[j+1]){
                    //引入第三方变量 进行交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //定义一个print方法 输出返回值
    public static void print(int[] arr){
        //遍历数组 打印输出比较结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
