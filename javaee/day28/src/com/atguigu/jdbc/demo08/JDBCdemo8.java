package com.atguigu.jdbc.demo08;

import java.util.List;

public class JDBCdemo8 {
    public static void main(String[] args) {
        StudentDAOlmpl dao = new StudentDAOlmpl();

        //添加学生对象
        //往数据库中新增一条数据
       Student s = new Student("李四",13);
        /*dao.addStudent(s);*/

        System.out.println("==============================================");

        //查询所有学生对象
        //查询数据库中所有数据
//        List<Student> list = dao.getAllStudent();
//        list.forEach(s1 -> System.out.println(s));

        System.out.println("================================================");

        //删除学生对象
        //往数据库中删除一条数据
//        dao.deleteStudent(10);

        System.out.println("=================================================");

        //修改学生对象
        //往数据库中修改一条数据
        s.setName("奥里给");
        s.setId(2);
//        dao.update(s);

        Student s2 = dao.getStudent(3);
        System.out.println(s2);


    }

}
