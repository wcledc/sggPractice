package practice;

import java.util.Scanner;

/*1.需求：模拟登录,给三次机会,并提示还有几次。
        用户名和密码都是admin*/
public class Hw1 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);

        //三次机会 循环三次
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pass = sc.nextLine();

//            用户名和密码都是admin
            if ("admin".equals(name) && "admin".equals(pass)){
                System.out.println("登录成功");
                return;
            }else {
                if (i == 2){
                    System.out.println("今天的机会已经用完了，请明天再来吧");
                }else{
                    System.out.println("您还剩" + (2 - i) + "次机会");
                }
            }
        }
    }
}
