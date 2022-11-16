package com.atguigu.servlet.demo01.demo04;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class SubServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //打印ServletConfig对象
        System.out.println(servletConfig);
        //获取Servlet的名称并打印
        System.out.println(servletConfig.getServletName());
        //获取servletContext对象并打印
        System.out.println(servletConfig.getServletContext());
        //通过指定的key获取指定的初始化参数value值
        System.out.println(servletConfig.getInitParameter("key222"));
        //获取初始化参数所有key(备注：将Enumeration理解为集合中的迭代器)
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        System.out.println("=================================================");

        //通过while循环进行遍历
        while (initParameterNames.hasMoreElements()){
            System.out.println(initParameterNames.nextElement());
        }
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

    }
}
