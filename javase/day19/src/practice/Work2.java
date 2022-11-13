package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/*file代表文件
dir代表文件夹*/

public class Work2 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\jay\\hardan");
        boolean b = file.exists();
        System.out.println(b);
        //创建文件 如果存在就不创建 如果不存在则自动创建 创建成功返回值为true
        System.out.println(file.createNewFile());
    }

    @Test
    public void Test1(){
        File file2 = new File("D:\\jay\\lbj");
        //创建单级文件夹 如存在则不创建 不存在 则创建 创建成功返回值为true
        boolean b = file2.mkdir();
        System.out.println(b);
        System.out.println(file2.exists());
    }

    @Test
    public void Test2(){
        File file3 = new File("D:\\叶湘伦\\叶惠美\\藤原拓海");
        //创建多级文件夹
        boolean b = file3.mkdirs();
        System.out.println(b);
        System.out.println(file3.exists());
    }
}
