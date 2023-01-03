package day04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpTcpServer {
    /**
     * 创建http tcp服务器端 访问静态资源
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket 监听端口号为80 http协议底层基于tcp协议封装
        // 默认端口号80 在浏览器中是不需要写的
        ServerSocket serverSocket = new ServerSocket(80);
      while (true){
          //2.监听客户端(浏览器)发送给服务器端数据 等待阻塞 获取客户端发送给服务器端的数据
           final Socket socket = serverSocket.accept();
          new Thread(new Runnable() {
              public void run() {
                  OutputStream outputStream=null;
               try {
                   //获取客户端  （浏览器发送数据给服务器端）
                   InputStream inputStream = socket.getInputStream();
                   byte[] reqByte = new byte[1024];
                   int reqLen = inputStream.read(reqByte);
                   String reqText = new String(reqByte, 0, reqLen);
                   String reqAddress=reqText.split("\r\n")[0].split(" ")[1];

                   //浏览器▶服务器端（tcpServer）直接静态资源给客户端
                    outputStream = socket.getOutputStream();
                   //程序读取本地磁盘中静态资源 到内存中
                   //再从内存中将该数据返回给客户端浏览器
                   File file = new File("public\\imgs"+reqAddress);
                   FileInputStream fileInputStream = new FileInputStream(file);
                   byte[] respBytes = new byte[1024];
                   int respLen = fileInputStream.read(respBytes);
                   outputStream.write(respBytes,0,respLen);
               }catch (Exception e){
                   e.printStackTrace();
try {
outputStream.write("500".getBytes());
}catch (Exception ioException){
    ioException.printStackTrace();
}
               }finally {
                 try {
                     //关闭资源
                     if (outputStream!=null)
                         outputStream.close();
                     if (socket!=null){
                         socket.close();
                     }
                 }catch (Exception e){
e.printStackTrace();
                 }

               }

                  }
          }).start();
      }

    }
}
