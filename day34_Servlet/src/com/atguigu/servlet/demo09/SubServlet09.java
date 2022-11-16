package com.atguigu.servlet.demo09;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class SubServlet09 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取指定请求参数
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //获取指定的请求参数
        String password = request.getParameter("password");
        System.out.println("password = " + password);

        //获取爱好请求参数
       /* String hobby = request.getParameter("hobby");
        System.out.println("hobby = " + hobby);*/
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        System.out.println("========================================");

        //获取上下文路径
        String contextPath = request.getContextPath();
        System.out.println("contextPath = " + contextPath);

        //获取端口号
        int serverPort = request.getServerPort();
        System.out.println("serverPort = " + serverPort);

        //获取主机名
        String serverName = request.getServerName();
        System.out.println("serverName = " + serverName);

        //获取url配置路径
        String servletPath = request.getServletPath();
        System.out.println("servletPath = " + servletPath);

        //获取协议
        String scheme = request.getScheme();
        System.out.println("scheme = " + scheme);

        System.out.println("=====================================");

        //获取指定的请求头中信息
        System.out.println(request.getHeader("User-Agent"));
        System.out.println(request.getHeader("Referer"));
    }
}
