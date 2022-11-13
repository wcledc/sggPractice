package com.atguigu.socket.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建TCP协议服务端对象
        ServerSocket ss = new ServerSocket(6666);

        //将服务端对象实时侦听访问过来的客户端对象
        Socket s = ss.accept();

        //获取访问过来的客户端输入流对象
        InputStream is = s.getInputStream();

        //读取流中的内容
        int len;
        byte[] arr = new byte[8192];
        while ((len = is.read(arr)) != -1){
            System.out.println(new String(arr));
        }
        //关闭资源
        is.close();
        s.close();
        ss.close();
    }
}
