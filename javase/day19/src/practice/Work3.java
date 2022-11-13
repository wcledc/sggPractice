package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Work3 {
    public static void main(String[] args) throws Exception {
        //创建文件 如果不带盘符（D:)   则默认创建在当前项目下
        File file = new File("ccc.txt");

        System.out.println(file.createNewFile());
        //文件重命名 注意事项：如果文件路径相同 就是改名
        //file.renameTo(new File("kkk.txt"));
        //文件重命名 注意事项：如果路径名不同 就是改名并剪贴
        file.renameTo(new File("D://kkk.txt"));

    }

    @Test
    public void Test1(){
        File file1 = new File("D://kkk.txt");
        //删除文件或文件夹   注意事项：java中的删除不走回收站，删除则彻底删除    删除文件夹 文件夹不能包含文件或者文件夹
        file1.delete();
        System.out.println(file1.exists());
    }
}
