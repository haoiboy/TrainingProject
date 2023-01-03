package day03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        //服务器可以一直接受 客户端数据
        //创建监听端口号码 ServerSocket
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务器启动成功.....");
        while (true) {
            //监听客户端发送过来的数据注意 我们的客户端没有发送数据给服务器端 该方法就会在这里一直阻塞
            final Socket socket = serverSocket.accept();
            //不允许单独new线程 线程池来维护线程--java进阶
            new Thread(new Runnable() {
                public void run() {
                    try {
                        //接受客户端数据
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = inputStream.read(bytes);
                        //服务器接受客户端数据包：userName=mayikt&userPwd=meite
                        String reqText=new String(bytes, 0, len);
                        String userName=reqText.split("&")[0].split("=")[1];
                        String userPwd=reqText.split("&")[1].split("=")[1];
                        //回应数据给客户端 如果验证账号和密码正确就是ok 否则失败fail
                        OutputStream outputStream = socket.getOutputStream();
                        if ("mayikt".equals(userName)&&"123456".equals(userPwd)){
                            outputStream.write("ok".getBytes());
                        }else {
                            outputStream.write("fail".getBytes());
                        }
                        //关闭资源
                        inputStream.close();
                        outputStream.close();
                        socket.close();
                    } catch (Exception e) {

                    }
                }

            }).start();
        }
    }
}
