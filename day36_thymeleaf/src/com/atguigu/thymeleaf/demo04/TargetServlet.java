package com.atguigu.thymeleaf.demo04;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TargetServlet extends ViewBaseServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("target被执行了");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "=" + password);
    }
}
