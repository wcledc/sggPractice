package test;

import java.util.Scanner;

/*
1.需求：模拟登录,给三次机会,并提示还有几次。
用户名和密码都是admin
分析:
    1.键盘录入 String
    2.多次操作  循环 三次
    3.校验
        成功 登录成功
        失败 提示还有几次登录机会
 */
public class Test1 {
    public static void main(String[] args) {
        //控制台模拟登录 需要键盘录入 Scanner
        Scanner sc = new Scanner(System.in);
        //多次操作 三次机会 循环3次 for循环
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();     //将键盘录入的用户名存储在name中
            System.out.println("请输入密码");
            String pass = sc.nextLine();     //将键盘录入的密码存储在pass中

            //用户名和密码都是admin
            //校验 成功 登录成功  失败 提示还有几次登录机会
            if ("admin".equals(name) && "admin".equals(pass)){
                System.out.println("登陆成功");
                return;
            }else{
                if (i == 2){    //最后一次机会
                    System.out.println("明天再重新尝试吧");
                }else {
                    // 失败 提示还有几次登录机会  1-2 2-1 3-0
                    System.out.println("登录失败，还有"  + (2 - i) + "次机会");
                }
            }
        }
    }
}
