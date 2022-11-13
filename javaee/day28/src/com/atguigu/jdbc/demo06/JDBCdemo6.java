package com.atguigu.jdbc.demo06;

import com.atguigu.jdbc.util.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCdemo6 {
    public static void main(String[] args) throws SQLException {
       try(
               Connection conn = JDBCUtil.getConnection()
       ){
           System.out.println(conn);
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
