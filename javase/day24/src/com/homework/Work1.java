package com.homework;

import java.sql.*;

public class Work1 {
    public static void main(String[] args) throws Exception {
        update();

    }
    private static void update() throws Exception {
        //连接驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //声明数据库名，账号，密码
        String url = "jdbc:mysql://localhost:3306/atguigu";
        String user = "root";
        String password = "root";

        try {
            //创建数据库连接对象
            Connection conn = DriverManager.getConnection(url,user,password);
            //创建sql语句对象
            Statement cs = conn.createStatement();
            //创建sql语句
            String sql = "select * from stu1";
            //执行sql语句
            ResultSet rs = cs.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                Student stu = new Student(id,name,age);
                System.out.println(stu);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }


//        //创建数据库连接对象
//        Connection conn = DriverManager.getConnection(url,user,password);
//        //创建sql语句对象
//        Statement cs = conn.createStatement();
//        //创建sql语句
//        String sql = "select * from stu1";
//        //执行sql语句
//        ResultSet rs = cs.executeQuery(sql);

//        while (rs.next()){
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            int age = rs.getInt(3);
//            Student stu = new Student(id,name,age);
//            System.out.println(stu);
//        }

//        rs.close();
//        cs.close();
//        conn.close();

    }
}
