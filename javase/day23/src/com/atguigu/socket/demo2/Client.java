package com.atguigu.socket.demo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建TCP协议客户端对象
        Socket s = new Socket("127.0.0.1",12345);

        //获取客户端的输出流对象
        OutputStream os = s.getOutputStream();

        //写数据 往服务器发送消息
        os.write("不能说的秘密".getBytes());

        //关闭资源
        os.close();
        s.close();
    }
}
