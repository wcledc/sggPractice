package com.atguigu.servlet.demo04;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet04 implements Servlet {
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

        //存储域对象参数
        servletContext.setAttribute("key","value");
        System.out.println("存储域对象参数");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
