package com.atguigu.jdbc.demo05;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCdemo5 {
    public static void main(String[] args) throws Exception {
        //1.导入德鲁伊jar包
        //2.获取数据库连接池对象
        DruidDataSource dds = new DruidDataSource();

        //3.设置数据库连接所需的参数
        dds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/atguigu");
        dds.setUsername("root");
        dds.setPassword("root");

        //4.设置数据库连接池所需的参数
        dds.setMaxActive(10);
        dds.setMaxWait(5000);

        //5.通过连接池对象获取数据库连接对象
        Connection conn = dds.getConnection();
        /*for (int i = 0; i < 15; i++) {
            Connection conn = dds.getConnection();
            System.out.println(conn);
            //conn.close();
        }*/
        //交还连接对象
        conn.close();

    }
}
