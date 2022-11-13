package com.atguigu;
/*使用StringBuilder完成

        需求：把数组中的数据按照指定个格式拼接成一个字符串
        举例：
        int[] arr = {1,2,3};
        输出结果：
        "[1, 2, 3]"*/

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + ",");
        }
        sb.append(arr[2] + "]");
        String s = sb.toString();
        System.out.println(s);

    }
}