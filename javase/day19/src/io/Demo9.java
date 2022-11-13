package io;

import org.testng.annotations.Test;

import java.io.*;

public class Demo9 {
    public static void main(String[] args) throws Exception {

        //字符缓冲流
        //创建流对象  缓冲字符输入流
        BufferedReader br = new BufferedReader(new FileReader("kkk.txt"));

        //使用流
        String line ;
        while ((line = br.readLine()) != null){   //读取一整行  .readLine
            System.out.println(line);
        }

        //关流
        br.close();
    }

    @Test
    public void Test1() throws Exception {
        //创建流对象  缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("edc.txt"));

        //使用流对象
        bw.write("节制比放纵更自由");
        //bw.newLine();  //换行

        //关闭流
        bw.close();

    }
}
