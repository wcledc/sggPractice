package com.atguigu;
//选择排序
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {34,59,86,12,23};
        sortArr(arr);
        printArr(arr);
    }
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0 + i + 1; j < arr.length - 1 - i + i + 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
