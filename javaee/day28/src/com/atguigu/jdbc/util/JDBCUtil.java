package com.atguigu.jdbc.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    //创建dataSource实现类对象
    private static DataSource ds;
    //私有化构造器
    private JDBCUtil(){}

    static {
        try {
            Properties pro = new Properties();
            pro.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
                ds = DruidDataSourceFactory.createDataSource(pro);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        if (ds != null){
            return ds.getConnection();
        }
        throw new RuntimeException("DataSource初始化错误");
    }
}
