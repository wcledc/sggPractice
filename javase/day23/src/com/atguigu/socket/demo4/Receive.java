package com.atguigu.socket.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //创建UDP协议接收端对象
        DatagramSocket ds = new DatagramSocket(12345);

        //创建接收端数据报包对象所需的数据
        byte[] arr = new byte[8192];
        int length = arr.length;

        DatagramPacket dp = new DatagramPacket(arr, length);

        //创建”数据报包“对象
        ds.receive(dp);
        //获取数据报包中的IP
        String ip = dp.getAddress().getHostAddress();

        byte[] data = dp.getData();

        int len = dp.getLength();

        //解析数据报包
        System.out.println(ip + ":" + new String(data,0,len));

        //关闭资源
        ds.close();


    }
}
