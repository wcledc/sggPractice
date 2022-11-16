package com.atguigu.servlet.demo13;

import java.util.Arrays;

public class Student {
    private int id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String[] hobby;

    public Student(int id, String username, String password, String phone, String email, String[] hobby) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.hobby = hobby;
    }

    public Student(String username, String password, String phone, String email, String[] hobby) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.hobby = hobby;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
