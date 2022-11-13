package com.atguigu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo5 {
    public static void main(String[] args) {

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        LocalDateTime dateTime = LocalDateTime.of(2018, 12, 29, 10, 56, 07);
//        System.out.println(dateTime);

        //创建一个日期时间格式化器
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss ");
//        LocalDateTime time --> String
        LocalDateTime now1 = LocalDateTime.now();
//        pattern.format(pattern)

    }
}