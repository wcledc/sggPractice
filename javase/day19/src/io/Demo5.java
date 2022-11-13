package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo5 {
    public static void main(String[] args) throws Exception {
        //字符输入流
        //创建流对象

        FileReader fr = new FileReader("kkk.txt");

        //使用流
        int ch;   //读到的字符数据
        while ((ch = fr.read()) != -1){    //不等于-1
            System.out.println((char) ch);     //强转成char型
        }


        //关流
        fr.close();
    }
}
