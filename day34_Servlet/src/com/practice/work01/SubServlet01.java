package com.practice.work01;

import javax.servlet.*;
import java.io.IOException;

public class SubServlet01 implements Servlet {
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
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
