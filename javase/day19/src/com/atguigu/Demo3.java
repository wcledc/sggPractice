package com.atguigu;

import java.io.File;
import java.io.IOException;

/*
   File 广义上 文件和文件夹
       狭义   文件
       dir   文件夹
   - public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了，创建成功返回true
   - public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了   单级文件夹
   - public boolean mkdirs():创建多级文件夹,如果父文件夹不存在，会帮你创建出来
    */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://jay//叶湘伦.txt");
        System.out.println(file.exists());

        boolean newFile = file.createNewFile();
        System.out.println(file.exists());
        System.out.println(newFile);

    }
}
