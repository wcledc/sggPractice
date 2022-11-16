package com.atguigu.servlet.demo03;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet03 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取servletContext对象
        ServletContext servletContext = servletRequest.getServletContext();

        //获取域对象参数
        Object obj = servletContext.getAttribute("key");
        System.out.println("获取域对象参数");
        System.out.println(obj);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
