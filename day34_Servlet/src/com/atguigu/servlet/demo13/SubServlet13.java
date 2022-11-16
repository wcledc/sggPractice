package com.atguigu.servlet.demo13;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

public class SubServlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取学生对象所需的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String[] hobbies = request.getParameterValues("hobby");

        //创建学生对象
        Student s = new Student(username, password, phone, email, hobbies);
        //打印学生对象
        System.out.println(s);

        System.out.println("==================================================");

        //通过请求获取表单map集合对象
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历集合
        //parameterMap.forEach((key,value) -> System.out.println(key + "=" + Arrays.toString(value)));

        //以无参构造器创建学生对象
        Student student = new Student();

        //通过BeanUtils将map集合中的表单数据存储给Student对象
        try {
            BeanUtils.populate(student,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(student);
    }

}
