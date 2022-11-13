package com.atguigu.jdbc.demo08;

import com.atguigu.jdbc.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.List;

public class StudentDAOlmpl implements StudentDAO{
    //创建queryRunner sql语句操作对象
    private QueryRunner qr = new QueryRunner();

    @Override
    public void addStudent(Student s) {
        try(
                //获取数据库连接对象
             Connection conn = JDBCUtil.getConnection();
           ){
            //编写预执行sql语句
            String sql = "insert into stu3 values (null,?,?)";
            //执行预编译sql语句
            qr.update(conn,sql,s.getName(),s.getAge());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int sid) {
        try(
             //获取数据库连接对象
             Connection conn = JDBCUtil.getConnection();
            ){
            //编写预编译sql语句
            String sql = "delete from stu3 where id = ?";
            //执行sql语句
            qr.update(conn,sql,10);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student s) {
        try(
             //创建数据库连接对象
             Connection conn = JDBCUtil.getConnection();
           ){
            //编写预编译sql语句
            String sql = "update stu3 set name = ? where id = ?";
            //获取sql语句预编译数据
            String name = s.getName();
            //执行sql语句
            qr.update(conn,sql,name,s.getId());
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Student> getAllStudent() {
        //声明list集合对象变量
        List<Student> list = null;
        try(
         //创建数据库连接对象
           Connection conn = JDBCUtil.getConnection();
           ){
            //编写预编译sql语句
            String sql = "select * from stu3";
            //使用DButils进行查询操作
            list = qr.query(conn,sql,new BeanListHandler<>(Student.class));
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Student getStudent(int sid) {
        try(
           //获取数据库连接对象
           Connection conn = JDBCUtil.getConnection();
           ) {
            //编写预编译sql语句
            String sql = "select * from stu3 where id = ?";
            //执行sql语句
            //qr.query(conn,sql,sid);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
