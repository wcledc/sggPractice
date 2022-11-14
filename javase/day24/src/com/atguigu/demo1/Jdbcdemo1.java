package com.atguigu.demo1;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName JDBCDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年09月30日 08时40分43秒
 * @Version 1.0
 *
 * JDBC(Java DataBase Connection)
 *      含义:Sun针对Java和数据库的连接提供的一组规范
 *
 * JDBC环境的搭建:
 *      1.创建数据库和设计表结构
 *      2.模块下导入JDBC的jar包
 *          (1)在模块根路径下新建libs文件夹
 *          (2)将JDBC的驱动jar放到libs文件夹下
 *          (3)鼠标右键点击JDBC驱动jar包,将其加载到"模块"下
 *      3.通过反射注册驱动
 *         更早版本mysql驱动类：org.gjt.mm.mysql.Driver(忽略)
 *         MySQL5.X版本：com.mysql.jdbc.Driver
 *         MySQL8.X版本：com.mysql.cj.jdbc.Driver
 *      4.通过DriverManager获取Java和DB的连接对象Connection
 *      5.关闭资源
 *
 * DriverManager类
 *      类的特点
 *          针对JDBC驱动进行管理的工具类
 *      类的位置
 *          java.sql
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static Connection getConnection(String url,String user,String password)
 *              试图建立到给定数据库 URL 的连接。
 *
 * Connection接口
 *      接口的特点
 *          针对指定数据库的连接工具接口
 *      接口的位置
 *          java.sql
 *      接口的方法
 *          void close()
 *              立即释放此 Connection 对象的数据库和 JDBC 资源，而不是等待它们被自动释放。
 *          void commit()
 *              使所有上一次提交/回滚后进行的更改成为持久更改，并释放此 Connection 对象当前持有的所有数据库锁
 *          void rollback()
 *              取消在当前事务中进行的所有更改，并释放此 Connection 对象当前持有的所有数据库锁。
 *          Statement createStatement()
 *              创建一个 Statement 对象来将 SQL 语句发送到数据库。
 *          PreparedStatement prepareStatement(String sql)
 *              创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
 *          void setAutoCommit(boolean autoCommit)
 *              将此连接的自动提交模式设置为给定状态。
 */
public class Jdbcdemo1 {
    public static void main(String[] args) throws Exception {
        //导入jar包
        //利用反射 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //声明获取数据库连接对象所需的数据 数据库名 数据库账号和密码
        String url = "jdbc:mysql://localhost:3306/atguigu";
        String username = "root";
        String password = "root";

        //通过DriverManager获取Java和DB的连接对象Connection
                                    //指定所要连接的数据库 并输入数据库账号和密码
        Connection conn = DriverManager.getConnection(url, username, password);

        //打印连接对象
        System.out.println(conn);

        //关闭资源
        conn.close();
    }


}
