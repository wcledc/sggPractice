package bean;

import java.util.Objects;

public class Student implements Comparable{

    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 由默认的比较地址值--> 比较属性值
    // index相同时 才调用
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    /*
         返回值 是hash值
         计算时,需要一个约定 目标
            属性值相同 hash值一定相同 -> index 一定相同 --> 需要调用equals()
            属性值不同  hash 值 尽可能不同 --> index 尽可能不同--> 不需要调用equasl()
         */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
            compareTo  具体的自然排序的方法
            返回值  决定了如何排序  代表 两个对象的差值(后 - 前)
                返回值为正值
                            前< 后   顺序 保存
                        负值
                            前 > 后    倒序保存
                        0   两个对象的差值为0

              按照年龄排
                如果年龄相同 按姓名排
         */
    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int num = this.getAge() - s.getAge();
        return (num == 0)? this.getName().compareTo(s.getName()):num;
    }
}
