package practice;
/*需求:给定一串字符串,校验其是否是 qq号码
        1:要求必须是5-15位数字
        2:0不能开头
        3:必须都是数字*/
public class Work7 {
    public static void main(String[] args) {
        System.out.println(checkQQ("464547678"));
        System.out.println(checkQQ("09899844"));
        System.out.println(checkQQ("4394"));
        System.out.println(checkQQ("8935809380583035335"));
    }

    //定义一个返回值类型为boolean 参数列表为String qq的方法
    public static boolean checkQQ(String qq){
        /*开关思想  默认一种状态 只需要判断另一种状态
          正向证明
          反向证明*/
        boolean flag = true;

        //1:要求必须是5-15位
        if (qq.length() >= 5 && qq.length() <= 15){
            //2:0不能开头
            if (!qq.startsWith("0")){
                //3:必须都是数字
                char[] charArray = qq.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    char ch = charArray[i];
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
