package com.atguigu.socket.demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws Exception {
        //获取本地IP地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("ip的主机名：" + ip.getHostName());
        System.out.println("ip的IP地址：" + ip.getHostAddress());

        //获取指定电脑的IP地址对象
        InetAddress ip2 = InetAddress.getByName("DESKTOP-PABA44M");
        System.out.println("ip2的主机名：" + ip2.getHostName());
        System.out.println("ip2的IP地址：" + ip2.getHostAddress());

        //获取指定电脑IP地址对象
        InetAddress ip3 = InetAddress.getByName("192.168.13.21");
        System.out.println("ip3的主机名：" + ip3.getHostName());
        System.out.println("ip3的IP地址：" + ip3.getHostAddress());


    }
}
