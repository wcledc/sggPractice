package com.atguigu.jdbc.demo02;

import com.atguigu.jdbc.demo01.Student;

import java.sql.*;
import java.util.Scanner;

public class JDBCdemo2 {
    public static void main(String[] args) throws Exception {
//        query();
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

        //声明预编译sql
        String sql = "insert into stu1 values (null,?,?)";

        //通过数据库连接对象获取sql语句对象
        PreparedStatement ps = conn.prepareStatement(sql);
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();

        //设置预编译sql中的执行信息
        //参数index指从第几个开始？
        ps.setString(1,name);
        ps.setInt(2,age);

        //通过sql语句对象调用sql语句执行方法 执行sql语句
        //executeUpdate()方法 用于增 删 改
        ps.executeUpdate();

        //关闭资源
        sc.close();
        ps.close();
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

        //声明预编译sql
        String sql = "select * from stu1 where id = ?";

        //通过数据库连接对象获取sql语句对象
        PreparedStatement ps = conn.prepareStatement(sql);

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的id");
        String sid = sc.nextLine();

        //设置sql预编译信息
        ps.setString(1,sid);
        //sql语句查询方法
        ResultSet rs = ps.executeQuery();

        //解析结果集对象
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);

            //创建Student对象
            Student stu = new Student(id,name,age);
            System.out.println(stu);
        }

        //关闭资源
        sc.close();
        rs.close();
        ps.close();
        conn.close();

    }
}

