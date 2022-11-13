package io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws Exception {

        //字节输入流     字节流读取中文时会出现乱码
        //创建流对象    关联对应的文件     读取时要求该文件一定要存在
        FileInputStream fis = new FileInputStream("jay.txt");

        //使用流对象（读/写） 方法1：一个一个读 太慢        当文件读到末尾时 返回一个-1
//        int b;  //读到的字节数据
//        while ((b = fis.read()) != -1){   //循环条件：未达到文件末尾
//            System.out.println(b);
//        }

        //方法2：打包装到一个容器中
        byte[] arr = new byte[5];  //创建一个数组 相当于容器
        int len;   //返回数组的个数
        while ((len = fis.read(arr)) != -1){
            System.out.println(new String(arr,0,len));
        }

        //关流
        fis.close();
    }

}
