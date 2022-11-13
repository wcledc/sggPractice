package practice;
/*
   3.把一个字符串的首字母转成大写，其余为小写
   例: "sdjFdC"==>"Sdjfdc"
   分析:
       1.首字母 --> 大写
       2.其他字母 --> 小写
       3.大写首字母 和小写其他字母进行拼接
    */
public class Work3 {
    public static void main(String[] args) {
        //定义字符串
        String s = "sdjFdC";

        //1.首字母 --> 大写
        //String substring(int start,int end):从指定位置开始(含)到指定位置结束截取字符串。
        String s1 = s.substring(0, 1);
        //String toUpperCase():把字符串转成大写。
        String s2 = s1.toUpperCase();

        //2.其他字母 --> 小写
        //String substring(int start):从指定位置开始截取字符串(含),默认到末尾。
        String s3 = s.substring(1);
        //String toLowerCase():把字符串转成小写
        String s4 = s3.toLowerCase();

        //3.大写首字母 和小写其他字母进行拼接
        String s5 = s2.concat(s4);
        System.out.println(s5);

        //链式编程
        String s6 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(s6);
    }
}
