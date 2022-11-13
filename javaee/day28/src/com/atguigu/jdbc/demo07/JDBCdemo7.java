package com.atguigu.jdbc.demo07;

/*DBUtils插件:
        *      针对SQL操作优化的插件
        *
        * QueryRunner类
        *      类的特点:
        *          针对SQL操作工具类
        *      类的位置:
        *          org.apache.commons.dbutils
        *      类的构造器:
        *          QueryRunner()
        *      类的方法:
        *          update(Connection conn, String sql, Object... params)
        *              针对增删改操作的方法
        *          query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params)
        *              针对查询操作的方法*/

import com.atguigu.jdbc.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class JDBCdemo7 {
    public static void main(String[] args) {
        //sql语句执行的优化方法
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner();

        try(
                //通过Uitl工具类获取连接对象
                Connection conn = JDBCUtil.getConnection()
           ){
            //设置预编译sql语句
            String sql = "insert into stu3 values (null,?,?)";

            //执行预编译sql语句
            qr.update(conn,sql,"张三",18);

        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
