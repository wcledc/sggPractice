package com.atguigu;
import java.util.Scanner; //导包
public class shuru {
    public static void main(String[] args) {
        //创建键盘输入对象（Scanner)对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        //调用输入方法
        sc.nextInt();
        //释放资源
        sc.close();
    }
}
