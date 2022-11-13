package com.atguigu;

public class Demo01 {
    public static void main(String[] args) {
       //int [][] arr = new int[4][3];
        //System.out.println(arr[0]);
        //System.out.println(arr[1][2]);

        int [][] arr = {{2,4,5},{1,3},{4,7,6},{2,4,1}};
        //System.out.println(arr[1][1]);
        //System.out.println(arr[2][1]);
        //printArr(arr);
        //System.out.println(arr);
        sumArr(arr);
        System.out.println(sumArr(arr));
    }
    //二维数组遍历
    /*  提示
     外循环控制的是二维数组的长度，其实就是一维数组的个数。
      内循环控制的是一维数组的长度。*/
    //itar  for循环快捷键
    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            //arr[i]代表的是每一个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    //二维数组求和
    public static int sumArr(int arr[][]){
        int sum = 0;      // 定义变量 记录每次相加的结果
        for (int i = 0; i < arr.length; i++) {  //获取每一个一维数组
            for (int j = 0; j < arr[i].length; j++) { // 遍历每一个一维数组中的元素
                sum += arr[i][j];
            }
        }
        return sum;
    }
}


