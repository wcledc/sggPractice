package com.atguigu.servlet.work01;
/*说明:
        1. 系统中只有一个用户(用户名: admin,密码: 123456)
        2. 相关资源:
        index.html : 登录表单页面
        LoginServlet: 处理登录请求的Servlet
        login_success.html : 登录成功页面(提示: 登录成功)
        login_error.html : 登录失败页面(提示: 用户名或密码不正确)*/
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //假设系统中只有一个用户（用户名: admin,密码: 123456)
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //进行条件判断
        if ("admin".equals(username) && "123456".equals(password)){
            //获取请求转换器（对象），既可以转发给另外一个Servlet，也可以转发给另外一个html页面
            request.getRequestDispatcher("login_success.html").forward(request,response);
        }else{
            //登录失败
            request.getRequestDispatcher("login_error.html").forward(request,response);
        }
    }
}
