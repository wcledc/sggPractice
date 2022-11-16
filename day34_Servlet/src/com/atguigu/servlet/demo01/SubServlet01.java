package com.atguigu.servlet.demo01;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet01 implements Servlet {
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取servletConftext接口实现类对象1
        //通过ServletConfig进行获取
        ServletContext servletContext1 = getServletConfig().getServletContext();
        System.out.println(servletContext1);
        //获取servletConftext接口实现类对象2
        //通过service方法的形参ServletRequest进行获取
        ServletContext servletContext2 = servletRequest.getServletContext();
        System.out.println(servletContext2);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
