package com.atguigu;
 /*
        TreeSet 去重
            通过排序 进行去重

            核心: 如何保证元素的唯一性

            1>  Comparable   自然排序
                该元素 具备排序的功能 (扩展该接口)  重写comparTo()
                    该方法的返回值 代表 两个对象的差值
                    返回值 0  差值为0  相等--> 去重
                          正数  前 < 小   正序
                          负数  前 > 后  后序
     */
 /*
        TreeSet
            如何保证元素的唯一性 : 排序
                自然排序  :
                    自定义类 实现接口Comparable  重写compareTo()
                            compareTo()返回值  决定了如何排序  代表 两个对象的差值(后 - 前)
                                返回值为正值  : 前< 后   顺序 保存
                                        负值 : 前 > 后    倒序保存
                                         0   : 两个对象的差值为0  保存首元素,其他去重
     */
import bean.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.compareTo(o2);
                return (num == 0) ? 1 : num;
            }
        });
        set.add(new Student("叶湘伦",21));
        set.add(new Student("叶湘伦",21));
        set.add(new Student("叶惠美",24));
        set.add(new Student("叶惠美",24));
        set.add(new Student("路小雨",20));
        set.add(new Student("陈冠希",23));
        set.add(new Student("路小雨",20));
        set.add(new Student("陈冠希",23));

        System.out.println(set.size());
        System.out.println(set);
    }
}
