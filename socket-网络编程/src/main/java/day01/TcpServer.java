package day01;

import com.sun.security.ntlm.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        //服务器可以一直接受 客户端数据
        //创建监听端口号码 ServerSocket
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务器启动成功.....");
        while (true){
            //监听客户端发送过来的数据注意 我们的客户端没有发送数据给服务器端 该方法就会在这里一直阻塞
            Socket socket = serverSocket.accept();
            //接受客户端数据
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            System.out.println("服务器收到的数据："+new String(bytes,0,len));
            //回应数据给客户端
            OutputStream outputStream = socket.getOutputStream();
            String resp="我收到啦"+ UUID.randomUUID().toString();
            outputStream.write(resp.getBytes());
            //关闭资源
            inputStream.close();
            socket.close();


        }
    }
}
