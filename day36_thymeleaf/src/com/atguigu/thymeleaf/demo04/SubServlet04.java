package com.atguigu.thymeleaf.demo04;

import com.atguigu.thymeleaf.demo02.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubServlet04 extends ViewBaseServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求域对象参数
        request.setAttribute("contextPath",request.getContextPath());

        //进行渲染转发
        super.processTemplate("th04",request,response);
    }
}
