package com.atguigu.jdbc.demo04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCdemo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //获取驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //声明数据库名，账号，密码
        String url = "jdbc:mysql://localhost:3306/atguigu";
        String user = "root";
        String password = "root";

        //获取连接对象
        Connection conn = DriverManager.getConnection(url,user,password);

        //声明预编译sql语句
        String sql1 = "update stu4 set money = money - 500 where name = ?";
        String sql2 = "update stu4 set money = money + 500 where name = ?";
        //通过连接对象获取sql语句对象
        PreparedStatement ps = null;

        try {
            //将事物提交方式由自动改为手动
            conn.setAutoCommit(false);

            //操作sql1语句
            ps = conn.prepareStatement(sql1);
            //设置sql预编译执行信息
            ps.setString(2,"张三");
            ps.executeUpdate();

            //手动异常 创造回滚条件
            System.out.println(1/0);

            //操作sql2语句
            ps = conn.prepareStatement(sql2);
            //设置sql预编译执行信息
            ps.setString(2,"李四");
            ps.executeUpdate();
            //提交事物
            conn.commit();
        }catch (Exception e){
            //回滚操作
            conn.rollback();
        }

        ps.close();
        conn.close();
    }
}
