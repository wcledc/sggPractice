package com.atguigu.jdbc.demo01;

import java.sql.*;
import java.util.Scanner;

public class JDBCdemo1 {
    public static void main(String[] args) throws Exception {
        update();
    }
    private static void update() throws Exception {
        //获取驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //声明数据库名，账号，密码
        String url = "jdbc:mysql://localhost:3306/atguigu";
        String user = "root";
        String password = "root";

        //通过DriverManager类获取连接数据库对象
        Connection conn = DriverManager.getConnection(url,user,password);

        //通过数据库连接对象获取sql语句对象
        Statement s = conn.createStatement();
        //编写sql语句
        String sql = "insert into stu1 values (null,'张三','17')";

        //通过statement对象调用sql语句执行方法
        //executeUpdate()方法 用于增 删 改
        s.executeUpdate(sql);
        System.out.println(sql);

        //关闭资源
        s.close();
        conn.close();


    }
    private static void query() throws Exception {
        //获取驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //声明数据库名，账号，密码
        String url = "jdbc:mysql://localhost:3306/atguigu";
        String user = "root";
        String password = "root";

        //通过DriverManager类获取连接数据库对象
        Connection conn = DriverManager.getConnection(url,user,password);

        //通过数据库连接对象获取sql语句对象
        Statement s = conn.createStatement();

        //sql语句查询方法
        //编写sql查询语句
        String sql1 = "select * from stu1";
        ResultSet rs = s.executeQuery(sql1);
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);

            //创建Student对象
            Student stu = new Student(id,name,age);
            System.out.println(stu);
        }

        //关闭资源
        rs.close();
        s.close();
        conn.close();

    }
}
