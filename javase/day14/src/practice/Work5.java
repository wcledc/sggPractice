package practice;

/*
5.需求：把字符串反转
    举例："abc"
    输出结果："cba"
分析
    1.获得当前字符串中的每一个字符  String->char[]
    2.将char[] 进行反转(自定义)  倒序遍历

    不会造轮子  已经存在的成熟的算法  功能 一般情况下 直接拿来使用
 */
public class Work5 {
    public static void main(String[] args) {
        //定义字符串
        String s = "abc";
        //将字符串转换为字节数组 得到每一个元素值
        char[] charArray = s.toCharArray();
        //定义一个字符串空串 用来接收 反转后的字符串
        String s1 = "";
        //将char[] 进行反转(自定义)  倒序遍历
        for (int i = charArray.length - 1; i>= 0; i--) {
            s1 += charArray[i];

        }
        System.out.println(s1);
    }
}
