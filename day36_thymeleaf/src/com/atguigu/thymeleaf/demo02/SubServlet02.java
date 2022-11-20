package com.atguigu.thymeleaf.demo02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubServlet02 extends ViewBaseServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //进行转发
        //request.getRequestDispatcher("/views/th01.html").forward(request,response);

        request.setAttribute("usernameError","用户名错误");

        //进行渲染转发
        super.processTemplate("th02",request,response);
    }

}
