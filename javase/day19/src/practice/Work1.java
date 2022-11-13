package practice;

import java.io.File;

public class Work1 {
    public static void main(String[] args) {
        //创建一个File类对象
        File file = new File("D:\\jay\\edc");
        System.out.println(file);
        //判断此文件是否存在
        System.out.println(file.exists());
    }
}
