package test;
/*
    5.需求：把字符串反转
		举例："abc"
		输出结果："cba"
	分析
		1.获得当前字符串中的每一个字符  String->char[]
		2.将char[] 进行反转(自定义)  倒序遍历

		不会造轮子  已经存在的成熟的算法  功能 一般情况下 直接拿来使用
     */
public class Test5 {
    public static void main(String[] args) {
        String s = "abc";
       // 1.获得当前字符串中的每一个字符  String->char[]
        char[] charArray = s.toCharArray();

        String s1 = "";
        //2.将char[] 进行反转(自定义)  倒序遍历
        for (int i = charArray.length - 1; i>=0; i--) {
            s1 += charArray[i];
        }
        System.out.println(s1);
    }
}
