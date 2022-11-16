package com.atguigu.servlet.demo01.demo03;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet implements Servlet {
    public SubServlet() {
        System.out.println("SubServlet的无参构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("SubServlet的init方法被执行了");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*Servlet的核心方法，现阶段所做的所有业务都编写在该方法中*/
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("SubServlet的service方法被执行了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /*Servlet类的销毁方法：需要在Servlet即将销毁前需要执行的代码编写在该方法中*/
    @Override
    public void destroy() {
        System.out.println("destroy方法被执行...");
    }
}
