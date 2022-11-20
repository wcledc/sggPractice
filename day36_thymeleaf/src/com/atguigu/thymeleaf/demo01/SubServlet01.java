package com.atguigu.thymeleaf.demo01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SubServlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符集，防止乱码
        response.setContentType("text/html;charset=utf-8");

        //通过响应获取打印流对象
        PrintWriter writer = response.getWriter();

        writer.write("<html>");
        writer.write("<head>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<h1>");
        writer.write("用户名或密码错误");
        writer.write("</h1>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
