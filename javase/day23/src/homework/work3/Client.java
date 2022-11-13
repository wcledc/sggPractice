package homework.work3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建TCP协议客户端对象
        Socket sc = new Socket("127.0.0.1",12345);

        //获取客户端对象的输出流对象
        OutputStream os = sc.getOutputStream();

        //向服务端发送消息
        os.write("海边的曼彻斯特".getBytes());
        sc.shutdownOutput();

        //获取客户端对象输入流对象
        InputStream is = sc.getInputStream();

        //解析服务端发送的回显消息
        int len;
        byte[] arr = new byte[8192];
        while ((len = is.read(arr))!= -1){
            System.out.println(new String(arr));
        }

        //关闭资源
        is.close();
        os.close();
        sc.close();

    }
}
