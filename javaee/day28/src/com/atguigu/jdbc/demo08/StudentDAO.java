package com.atguigu.jdbc.demo08;

import java.util.List;

public interface StudentDAO {
    //往数据库中新增一条数据
    void addStudent(Student s);
    //往数据库中删除一条数据
    void deleteStudent(int sid);
    //往数据库中修改一条数据
    void update(Student s);
    //查询数据库中所有数据
    List<Student> getAllStudent();
    //查询数据库中指定数据
    Student getStudent(int sid);
}
