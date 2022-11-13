package com.atguigu;

    /*
    File  代表的是文件或者目录的路径   该路径下对应的文件或者目录有可能是不存在

    - File(String pathname)：根据一个路径得到File对象
    - File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
    - File(File parent, String child):根据一个父File对象和
    一个子文件/目录得到File对象(将一个父级路径封装成File类，可以方便的使用File里的功能和方法)
        D://aaa//111.txt
        D:\aaa\111.txt
     */
import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://jay");
        System.out.println(file);

    }
}
