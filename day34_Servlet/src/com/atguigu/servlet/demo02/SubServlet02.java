package com.atguigu.servlet.demo02;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class SubServlet02 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取ServletConftext对象
        ServletContext servletContext = servletRequest.getServletContext();

        //获取上下文路径
        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath = " + contextPath);
        //获取虚路径的本地路径
        String realPath = servletContext.getRealPath("index.html");
        System.out.println(realPath);
        //获取指定key的全局初始化参数
        String value = servletContext.getInitParameter("key");
        //获取所有全局初始化参数的name
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            System.out.println(initParameterNames.nextElement());
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
