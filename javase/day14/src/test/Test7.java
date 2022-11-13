package test;
/*需求:给定一串字符串,校验其是否是 qq号码
        1:要求必须是5-15位数字
        2:0不能开头
        3:必须都是数字*/
public class Test7 {
    public static void main(String[] args) {
        System.out.println(checkQQ("464547678"));
        System.out.println(checkQQ("093398"));
        System.out.println(checkQQ("144343222222222222566"));
        System.out.println(checkQQ("2445"));
        System.out.println("*************************************");

        //正则表达式
        String regex = "[1-9]\\d{4,14}";
        System.out.println("123456".matches(regex));
        System.out.println("023456".matches(regex));
        System.out.println("12345gh6".matches(regex));
        System.out.println("123".matches(regex));

    }
    public static boolean checkQQ(String qq){
        /*开关思想  默认一种状态 只需要判断另一种状态
          正向证明
          反向证明*/
        boolean flag = true;

        //要求必须是5-15位数字
        if (qq.length() >= 5 && qq.length() <= 15){
            //0不能开头
            if (!qq.startsWith("0")){
                //将字符串转换为数组得到每一个元素值判断是否都为数字
                char[] charArray = qq.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    char ch = charArray[i];
                    //必须都是数字
                    if (!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
}
