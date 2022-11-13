package io;

/*普通流与缓冲流复制的效率测试*/

import org.testng.annotations.Test;

import java.io.*;

public class Demo7 {
    @Test
            public void Test1() throws Exception {
        //记录开始时间
        long start = System.currentTimeMillis();

        //创建流对象
        //普通字节输入流
        FileInputStream fis = new FileInputStream("E:\\青花瓷.wav");
        //普通字节输出流
        FileOutputStream fos = new FileOutputStream("E:\\青花瓷22.wav");

        //使用流对象 （读/写）
        byte[] arr = new byte[1024];
        int len;
        while ((len = fis.read(arr)) != -1){
            fos.write(arr,0,len);
        }

        //关闭流
        fis.close();
        fos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end - start)+" 毫秒");//491
    }


    @Test
    public void Test2() throws Exception {
        // 记录开始时间
        long start = System.currentTimeMillis();

        //创建流对象
        //缓冲字节输入流                                参数为 普通字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\青花瓷.wav"));
        //缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\青花瓷33.wav"));

        //使用流对象 （读/写）
        byte[] arr1 = new byte[1024];
        int len1;
        while ((len1 = bis.read(arr1)) != -1){
            bos.write(arr1,0,len1);
        }

        //关闭流
        bis.close();
        bos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end - start)+" 毫秒");//94
    }
}

