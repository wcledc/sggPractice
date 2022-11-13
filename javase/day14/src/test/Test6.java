package test;
/*
    6.需求：统计大串中小串出现的次数
            (这里的大串和小串可以自己根据情况给出)
        大串:woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao
        小串:guigu
        统计小串出现的次数

        分析:
		重复的操作: 大串中找小串(计数器++ ,大串的重新赋值)
		重复的条件: 大串中包含小串
     */
public class Test6 {
    public static void main(String[] args) {
        //定义大串
        String s1 = "woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao";
        String s2 = "guigu";

        //定义计数器 默认值为0；
        int count = 0;
        //定义索引 默认为0；
        int index = 0;

       //重复的条件: 大串中包含小串
        while (s1.contains(s2)){
            //重复的操作: 大串中找小串(计数器++ ,大串的重新赋值)
            count++;
            index = s1.indexOf(s2) + s2.length();
           s1 = s1.substring(index);
        }
        System.out.println(count);
    }
}
