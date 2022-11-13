package test;

/*
2.需求：统计一个字符串中大写字母字符，小写字母字符，
    数字字符出现的次数,其他字符出现的次数。
    ABCDEabcd123456!@#$%^
    分析:
        1.String -> char[] --> char
        2.计数器 统计
        3.判断每个字符 是否符合要求(大小写字母 数字  其他)
 */
public class Test2 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "ABCDEabcd123456!@#$%^";

        //计数器 统计
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        //String -> char[] --> char 把字符串转换为数组 遍历得到每个字符
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];  //得到每个字符

            //判断每个字符 是否符合要求(大小写字母 数字  其他)
            if (ch >= 'A' && ch <= 'Z'){
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println(bigCount +"***" + smallCount +"***" + numCount + "***" + otherCount);
       /* System.out.println(smallCount);
        System.out.println(numCount);
        System.out.println(otherCount);*/
    }
}
