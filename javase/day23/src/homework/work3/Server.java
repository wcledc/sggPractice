package homework.work3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建tcp协议服务端对象
        ServerSocket ss = new ServerSocket(12345);

        //将服务端对象实时侦听访问过来的客户端对象
        Socket s = ss.accept();

        //获取访问过来的客户端输入流对象
        InputStream is = s.getInputStream();

        //针对该客户端发送过来的内容进行解析操作
        int len;
        byte[] arr = new byte[8192];

        while ((len = is.read(arr))!= -1){
            System.out.println(new String(arr));
        }

        //获取该客户端的输出流对象
        OutputStream os = s.getOutputStream();

        //服务端向客户端发送回显消息
        os.write("蒲公英的约定".getBytes());
        s.shutdownOutput();

        //关闭流
        is.close();
        s.close();
        ss.close();

    }
}
