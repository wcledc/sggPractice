package io;
/*
需求:使用字节流完成一个图片/音频文件的拷贝
*/
/*
IO流使用步骤
        1> 创建流对象 关联对应的文件
        2> 进行读/写
        3> 关流
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo3 {
    public static void main(String[] args) throws Exception {

        //创建流对象
        //指定数据源
        FileInputStream fis = new FileInputStream("E:\\发如雪.mp3");

        //指定目的地
        FileOutputStream fos = new FileOutputStream("E:\\发如雪--copy.mp3");

        //读数据
        int len; //代表的每次读到了多少个
        byte[] b = new byte[5];
        while ((len = fis.read(b)) != -1){

            fos.write(b,len,0);
        }
        fis.close();
        fos.close();
    }
}
