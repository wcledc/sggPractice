package com.homework;

import com.atguigu.jdbc.util.JDBCUtil;
import com.homework.javebean.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/*需求:
        修改1号数据的 salary 为 10000
        添加一条记录
        删除刚才添加的记录
        查询id为1的记录，将其封装为Map集合
        查询所有记录，将其封装为List
        所有记录，将其封装为Emp对象的List集合
        查询总记录数*/
public class Work1 {
    //获取sql操作语句对象
    private static QueryRunner qr = new QueryRunner();

    @Test
    public void Test1(){
        //修改1号数据的 salary 为 10000
        try(
                //获取连接对象
                Connection conn = JDBCUtil.getConnection();
           ){
            //编写预编译sql语句
            String sql =  "update emp set salary = 10000 where id = ?";
            //执行sql语句
            qr.update(conn,sql,1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Test2(){
        //添加一条记录
        try(
             //获取连接对象
             Connection conn = JDBCUtil.getConnection();
            ){
            //编写预编译sql语句
            String sql = "insert into emp values (null,?,?,?,?)";
            //执行sql语句
            qr.update(conn,sql,"牛魔王","男",9999,"2021-12-21");
          } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Test3(){
        //删除刚才添加的记录
        try(
              //获取连接对象
              Connection conn = JDBCUtil.getConnection();
             ){
            //编写预编译sql语句
            String sql = "delete from emp where id = ?";
            //执行sql语句
            qr.update(conn,sql,6);
             } catch (Exception e){
            e.printStackTrace();
           }
    }
    @Test
    public void Test4(){
        //查询id为1的记录，将其封装为Map集合
        // 定义一个map集合变量
        //Map<String,Object> map = null;
        try(
                //获取连接对象
                Connection conn = JDBCUtil.getConnection();
           ){
                //编写预编译sql语句
            String sql = "select * from emp where id = ?";
            //执行sql语句
           Map<String,Object> map = qr.query(conn,sql,new MapHandler(),1);
            System.out.println(map);
            } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Test5(){
        //查询所有记录，将其封装为List
        //声明list集合对象变量
        List<Object> list = null;
        try(
                //获取连接对象
                Connection conn = JDBCUtil.getConnection();
           ){
                //预编译sql语句
                String sql = "select * from emp";
            list = qr.query(conn,sql,new BeanListHandler<>(Emp.class));
            list.forEach(s-> System.out.println(s));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Test6(){
        //所有记录，将其封装为Emp对象的List集合
        //声明list集合变量
        List<Emp> list = null;
        try(
             //获取连接对象
             Connection conn = JDBCUtil.getConnection();
           ){
            //编写预编译sql语句
            String sql = "select * from emp";
            //执行sql语句
            list = qr.query(conn,sql,new BeanListHandler<Emp>(Emp.class));
            list.forEach(s -> System.out.println(s));
            System.out.println(list.size());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
