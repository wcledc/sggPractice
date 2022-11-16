package com.atguigu.servlet.demo01.demo02;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet implements Servlet {

    public SubServlet() {
        System.out.println("Servlet构造器......");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("芭比Q了,完犊子了，我人没了......");
    }
}
