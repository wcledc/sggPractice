package com.atguigu;
/*- public Random()
        - public Random(long seed)//参数为种子

- public int nextInt()
		返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
- public int nextInt(int n)(重点掌握)
		返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        */
import java.util.Date;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        //构造方法
//        public Random()
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100) + 1); // 1 - 100  自己设定值范围
            System.out.println(r.nextInt());   //int 的取值范围
        }

//        - public Random(long seed)//参数为种子
    }
}
