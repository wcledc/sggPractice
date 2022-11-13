package io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws Exception {
        //字符输出流
        //创建流对象   并关联文件

        FileWriter fw = new FileWriter("111.txt");

        //使用流对象   写文件char[] ch = {89,35,75};
        fw.write("会尽快汇款地方");

        //关流
        fw.close();
    }
}
