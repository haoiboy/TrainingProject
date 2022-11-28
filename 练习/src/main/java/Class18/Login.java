package Class18;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        /**用户登录
         * 1.已知正确的用户名和密码 定义两个字符串 存放 用户名称 密码和密码
         * 2.键盘输入要登陆的用户名和密码
         */
        //1.
        String userName = "admin";

        String userPwd = "123456";
        Scanner scanner = new Scanner(System.in);
        //三次重试机会
        int pwdCount = 3;
        for (int i = 1; i <= pwdCount; i++) {
            System.out.println("请输入用户的名称：");
            String user = scanner.nextLine();
            System.out.println("请输入用户的密码：");

            String pwd = scanner.nextLine();
            if (userName.equals(user) && userPwd.equals(pwd)) {
                System.out.println("您输入的用户名和密码正确，恭喜您登陆成功");
                break;
            } if(i==pwdCount) {
                System.out.println("您的账户和密码 今天输入的错误次数达到三次，该账户被冻结");
           return; }
                System.out.println("您输入的用户名和密码不正确，登陆失败！还剩"
                        + ( pwdCount-i)+"次机会");
            }


            //用户输入的名称


        }
    }

