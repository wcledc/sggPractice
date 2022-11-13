package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;

/*- public String getAbsolutePath()：获取绝对路径
        - public String getPath():获取路径（获取构造方法中传入路径）
        - public String getName():获取名称（获取当前文件或者文件夹的名称）

        - public long length():获取长度。字节数
        - public long lastModified():获取最后一次的修改时间，毫秒值

        - public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
        - public File[] listFiles():获取指定目录下的所有文件或者文件夹的File对象数组*/
public class Work4 {
    public static void main(String[] args) {
        File file = new File("D:\\叶湘伦\\叶惠美\\藤原拓海");

//        -public String getAbsolutePath()：获取绝对路径
        System.out.println(file.getAbsoluteFile());

//        - public String getPath():获取路径（获取构造方法中传入路径）
        System.out.println(file.getPath());

//        - public String getName():获取名称（获取当前文件或者文件夹的名称）
        System.out.println(file.getName());
    }

    @Test
    public void Test1(){
        File file1 = new File("kkk.txt");

//        - public long length():获取长度。字节数
        System.out.println(file1.length());
    }

    @Test
    public void Test2(){
        File file2 = new File("D:\\jay");

        //- public long lastModified():获取最后一次的修改时间，毫秒值
        long l = file2.lastModified();
        System.out.println(l);
    }

    @Test
    public void Test3(){
        File file3 = new File("D:\\jay");

//        - public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
        String[] strings = file3.list();
        System.out.println(Arrays.toString(strings));

//        - public File[] listFiles():获取指定目录下的所有文件或者文件夹的File对象数组
        File[] files = file3.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
