package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
需求:使用字符流完成一个图片/音频文件的拷贝
*/
public class Demo4 {
    public static void main(String[] args) throws Exception {
        //创建流对象 关联流对应的数据
        FileReader fr = new FileReader("E:\\青花瓷.wav");

        FileWriter fw = new FileWriter("E:\\青花瓷.wav--copy");

        //操作流
        int len;
        char[] ch = new char[1024];

        while ((len = fr.read(ch)) != -1){

            //写数据
            fw.write(ch,0,len);
        }
        fr.close();
        fw.close();
    }
}
