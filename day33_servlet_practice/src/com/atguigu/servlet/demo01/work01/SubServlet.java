package com.atguigu.servlet.demo01.work01;

import javax.servlet.*;
import java.io.IOException;

//                        实现Servlet接口
public class SubServlet implements Servlet {
    //创建无参构造
    public SubServlet() {
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
        System.out.println("Servlet中的service方法被调用了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
    //重写Servlet接口中的方法

}
