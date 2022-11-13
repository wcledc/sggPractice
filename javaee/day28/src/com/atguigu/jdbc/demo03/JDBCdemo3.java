package com.atguigu.jdbc.demo03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCdemo3 {
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

        //获取数据库连接对象
        Connection conn = DriverManager.getConnection(url, user, password);

        //声明预编译sql执行语句
        String sql = "insert into stu2 values (null,?,?)";

        //通过数据库连接对象获取sql语句操作对象
        PreparedStatement ps = conn.prepareStatement(sql);

        //给sql预编译语句设置信息
        //批量设置sql预编译信息
        for (int i = 0; i < 1000; i++) {
            ps.setString(1,"name" + i);
            ps.setInt(2,18);
            //将sql语句添加到批处理中
            ps.addBatch();
        }
        //执行批处理sql语句
        ps.executeBatch();

        //关闭资源
        ps.close();
        conn.close();
    }
}
