package com.atguigu.servlet.demo12;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubServlet12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //假设系统中仅有唯一的用户，用户名：root，密码：root
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //进行条件判断
        if ("root".equals(username) && "root".equals(password)){
            //System.out.println("登录成功");
            //获取请求转发器（对象），既可以转发给另外一个servlet，也可以转发给另外一个html页面
            //RequestDispatcher successServlet = request.getRequestDispatcher("SuccessServlet");
            //执行转发
            //successServlet.forward(request,response);

            //链式编程
            //请求转发到servlet
            request.getRequestDispatcher("success.html").forward(request,response);
        }else{
            //System.out.println("登陆失败");
            //请求转发到html页面
            request.getRequestDispatcher("error.html").forward(request,response);
        }
    }
}
