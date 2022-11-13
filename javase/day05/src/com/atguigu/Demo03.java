package com.atguigu;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {77,66,55,44,33,22,11};
        reverseArr(arr);
        print(arr);
    }
//    数组反转
    public static void reverseArr(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int Max = arr.length - 1;
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
}
