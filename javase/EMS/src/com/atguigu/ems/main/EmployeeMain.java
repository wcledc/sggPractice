package com.atguigu.ems.main;

import com.atguigu.ems.domain.Employee;
import com.atguigu.ems.service.EmployeeService;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("迪迦", '男', 23, 2000, "3826348", "dj@.com");
        Employee emp2 = new Employee("戴拿", '男', 34, 2495, "235456", "dn@.com");
        Employee emp3 = new Employee("盖亚", '女', 18, 5968, "5005844", "gy@.com");
        Employee emp4 = new Employee("梦比优斯", '女', 22, 9665, "0969544", "mb@.com");
        Employee emp5 = new Employee("阿古茹", '男', 45, 34556, "307678", "ag@.com");
        Employee emp6 = new Employee("战神刑天", '男', 34, 2345, "4656348", "xt@.com");
        Employee emp7 = new Employee("疾电飞影", '男', 25, 688888, "3985348", "fy@.com");
        Employee emp8 = new Employee("爆裂金刚", '男', 29, 2087, "54678", "jg@.com");

        System.out.println(emp1.say());
        System.out.println(emp2.say());
        System.out.println(emp3.say());
        System.out.println(emp4.say());
        System.out.println(emp5.say());
        System.out.println(emp6.say());
        System.out.println(emp7.say());
        System.out.println(emp8.say());
        System.out.println("**************************************");

        EmployeeService empService = new EmployeeService(10);//参数的作用就是控制他内部的数组的长度

        //Employee[] employees = empService.getEmployees();

        boolean b1 = empService.addEmployee(emp1);
        boolean b2 = empService.addEmployee(emp2);
        boolean b3 = empService.addEmployee(emp3);
        boolean b4 = empService.addEmployee(emp4);
        boolean b5 = empService.addEmployee(emp5);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        /*
        for (int i = 0;i < employees.length;i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].say());
            } else {
                System.out.println(employees[i]);
            }
        }*/

        Employee[] allEmployess = empService.getAllEmployees();
        for (int i = 0; i < allEmployess.length; i++) {
            System.out.println(allEmployess[i].say());
        }

        System.out.println("***************************************");

        Employee employee = empService.getEmployee(-3);
        if (employee == null) {
            System.out.println("下标不合法");
        } else {
            System.out.println(employee.say());
        }

        System.out.println("*******************************************");
        //删除指定下标元素
       boolean bb = empService.removeEmployee(2);
        System.out.println(bb);

        Employee[] employees2 = empService.getAllEmployees();
        for (int i = 0; i < employees2.length; i++) {
            System.out.println(employees2[i].say());
        }
    }
}
