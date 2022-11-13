package com.atguigu;
/*需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。

        测试数据
张三,66,88,99
李四,66,88,99
王五,77,88,99
赵六,99,99,99
钱七,66,66,88
*/

/*分析：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
        1> 键盘录入  --> String --> "姓名,语文成绩,数学成绩,英语成绩"
        2> 学生类  属性: 姓名,语文成绩,数学成绩,英语成绩,总分
        3> 学生信息  数据源 来源于 String --> 获得每一个属性值  --> 构造Student对象
        4> Student 添加-->TreeSet  总分降序 排序  不去重
        5> 循环  集合元素的个数 5个*/
import bean.Student;
import bean.Student2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo6 {
    public static void main(String[] args) {
        //定义键盘输入
        Scanner sc = new Scanner(System.in);

        //定义一个tree Set集合                  自定义比较器
        TreeSet<Student2> set = new TreeSet<>(new Comparator<Student2>() {

            @Override
            public int compare(Student2 s1, Student2 s2) {
//                返回值为正值  : 前< 后   顺序 保存
//                负值 : 前 > 后    倒序保存
//                0   : 两个对象的差值为0  保存首元素,其他去重
                //总分倒序 排序 不取重
                int num = (int) (s2.getSum() - s1.getSum());
                return (num == 0) ? 1 : num;
            }
        });

        //请输入学生的成绩
        System.out.println("请输入学生的信息，格式：姓名,语文成绩,数学成绩,英语成绩");
        while (set.size() < 5){
            String line = sc.nextLine();
            String[] arr = line.split(",");
            Double chinese = Double.valueOf(arr[1]);
            Double math = Double.valueOf(arr[2]);
            Double english = Double.valueOf(arr[3]);

            set.add(new Student2(arr[0],chinese,math,english));
        }
        System.out.println(set);
    }
}
