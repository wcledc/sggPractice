package com.atguigu.servlet.demo05;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet05 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取servletConftext对象
        ServletContext servletContext = servletRequest.getServletContext();

        //删除域对象参数
        servletContext.removeAttribute("key");
        System.out.println("删除域对象参数");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
