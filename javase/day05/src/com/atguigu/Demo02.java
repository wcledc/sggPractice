package com.atguigu;

import sun.font.CreatedFontTracker;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89};
        int sum = getSum(arr);
        System.out.println(sum);
        int Max = getMax(arr);
        System.out.println(Max);
        int Min = getMin(arr);
        System.out.println(Min);
    }

    //求总和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //        求最大值
    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }
//       求最小值
     public static int getMin(int[] arr){
        int Min = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < Min){
                 Min = arr[i];
             }
         }
         return Min;
     }
/*      求平均值
    public static int getAvg(int[] arr){
        int sum = 0;
        int avg = sum/ arr.length;
    }*/

}

