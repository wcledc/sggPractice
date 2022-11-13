package practice;

/*
2.需求：统计一个字符串中大写字母字符，小写字母字符，
    数字字符出现的次数,其他字符出现的次数。
    ABCDEabcd123456!@#$%^
    分析:
        1.String -> char[] --> char
        2.计数器 统计
        3.判断每个字符 是否符合要求(大小写字母 数字  其他)
 */
public class Work2 {
    public static void main(String[] args) {

        //定义字符串
        String s = "ABCDEabcd123456!@#$%^";

        //定义计数器 统计次数 初始化为0
        int bigcount = 0;
        int smallcount = 0;
        int numcount = 0;
        int othercount = 0;
        //调用方法把字符串转换为数组 遍历得到每个元素值
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
        //判断每个字符 是否符合要求(大小写字母 数字  其他)
            if (ch >= 'A' && ch <= 'Z'){
                bigcount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallcount++;
            } else if (ch >= '0' && ch <= '9') {
                numcount++;
            }else {  //以上条件都不满足
                othercount++;
            }
        }
        System.out.println(bigcount + "," + smallcount + "," + numcount + "," + othercount);
    }
}
