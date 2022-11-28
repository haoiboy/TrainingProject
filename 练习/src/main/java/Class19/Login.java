package Class19;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        /**用户登录
         * 1.已知正确的用户名和密码 定义两个字符串 存放 用户名称 密码和密码
         * 2.键盘输入要登陆的用户名和密码
         */
        //1.
        String userName="admin";

        String userPwd="123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户的名称：");
       //用户输入的名称
        String user=scanner.nextLine();
        System.out.println("请输入用户的密码：");

        String pwd=scanner.nextLine();
        if(userName.equals(user) && userPwd.equals(pwd)){
            System.out.println("您输入的用户名和密码正确，恭喜您登陆成功");
        }else {
            System.out.println("您输入的用户名和密码不正确，登陆失败！");
        }

    }
    public void login(String user ,String pwd){
String username="admin";
String userPwd="123456";
if(username.equals(user)&&userPwd.equals(pwd)){
    System.out.println("正确");
}else {
    System.out.println("错误");
}
    }
}
