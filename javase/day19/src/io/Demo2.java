package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        //字节输出流
        //创建流对象   关联对应的文件          尾部追加: 一个参数 不追加 后面写的覆盖之前写的数据 ;加上ture 追加 不覆盖之前的数据
        FileOutputStream fos = new FileOutputStream("111.txt",true);

        //使用流对象    写数据 方法1： 一个一个写
        /*fos.write(96);
        fos.write(97);
        fos.write(67);*/

        //使用流对象   写数据 方法2：创建byte数组 写进数组中
       //byte[] arr = {97,98,99};
       // fos.write(arr);

        //方法3：直接写出字符串 调用字符串方法 字符串转字节数组
        fos.write("外行柔顺直道;内秉中正之德".getBytes());

        //关流
        fos.close();
    }
}
