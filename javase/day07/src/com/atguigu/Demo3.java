package com.atguigu;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        //print(arr);
        //print(1,3);
        print(4,2,4,5);
    }
    public static void print(int num,int...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println(num);

        }
    }
}
