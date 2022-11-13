package com.atguigu.socket.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建TPC客户端对象
        Socket s = new Socket("10.10.12.236",6666);

        //获取客户端的输出流对象
        OutputStream os = s.getOutputStream();

        //向服务端发送消息
        os.write("不能说的秘密".getBytes());
        s.shutdownOutput();

        //获取客户端对象的输入流对象
        InputStream is = s.getInputStream();
        //解析服务端发送的回显消息
        int len;
        byte[] arr = new byte[8192];
        while ((len = is.read(arr))!= -1){
            System.out.println(new String(arr));
        }
        //关流
        is.close();
        os.close();
        s.close();

    }
}
