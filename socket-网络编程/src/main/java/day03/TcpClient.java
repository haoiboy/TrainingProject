package day03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws Exception{
        //客户端是可以一直发送数据给服务器端
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户的名称：");
            String userName=sc.nextLine();
            System.out.println("请输入用户的密码：");
            String userPwd=sc.nextLine();

            Socket socket = new Socket("127.0.0.1", 8080);
            //获取到我们的outputStream
            OutputStream outputStream = socket.getOutputStream();
            //发送数据
            String reqText="userName="+userName+"&userPwd="+userPwd;
            outputStream.write(reqText.getBytes());
            //接受服务器端相应数据给客户端
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len=inputStream.read(bytes);
            //获取到服务器端响应数据
            String  resp=new String(bytes,0,len);
            if ("ok".equals(resp)){
                System.out.println("登录成功");
            }else {
                System.out.println("登陆失败");
            }
            System.out.println("客户端接收到服务器端响应数据："+new String(bytes,0,len));
            //关闭资源
            outputStream.close();
            socket.close();
        }
    }
}
