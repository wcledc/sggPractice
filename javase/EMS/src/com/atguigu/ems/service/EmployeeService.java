package com.atguigu.ems.service;

import com.atguigu.ems.domain.Employee;

public class EmployeeService {

    private Employee[] employees;//   用来保存员工对象的数组
    private int realCount = 0;//  记录已保存员工对象的数量

    public EmployeeService(int totalCount){
        this.employees = new Employee[totalCount];
    }

    public boolean addEmployee(Employee emp){
        if (realCount == this.employees.length){
            return false;
        }
        this.employees[realCount] = emp;
        realCount++;
        return true;
    }
    public Employee[] getAllEmployees(){
        Employee[] newArr = new Employee[realCount];
        for (int i = 0; i < realCount; i++) {
            newArr[i] = this.employees[i];
        }
        return newArr;
    }

    public Employee getEmployee(int index){
        if (index <0 || index >= realCount){
            return null;
        }
        return this.employees[index];
    }

    public boolean removeEmployee(int index) {
        if (index<0 || index>=realCount){
            return false;
        }
        employees[index] = null;
        for (int i = index; i < realCount - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[realCount-1] = null;
        realCount--;
        return true;
    }
}
