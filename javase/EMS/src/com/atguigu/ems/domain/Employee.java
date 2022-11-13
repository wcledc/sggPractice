package com.atguigu.ems.domain;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;
    private String phone;
    private String email;

    public Employee(){}

    public Employee(String name, char gender, int age, double salary, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String say(){
        return "姓名 ：" + name + ",性别 : " + gender + ",年龄 : " + age + ",工资 : " + salary + ",电话 : " + phone + ",邮箱 : " + email;
    }
}
