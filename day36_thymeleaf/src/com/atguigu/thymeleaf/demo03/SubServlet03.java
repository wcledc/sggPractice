package com.atguigu.thymeleaf.demo03;

import com.atguigu.thymeleaf.demo02.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubServlet03 extends ViewBaseServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //往请求域添加数据
        request.setAttribute("atguigu","尚硅谷");
        request.setAttribute("photo","img/sky22.jpg");

        //进行渲染转发
        super.processTemplate("th03",request,response);
    }
}
