package Class21;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //1.接收用户输入的字符
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入");
        String str=sc.nextLine();
        //2.定义三个变量出现的次数
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        //3.遍历字符串
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch>=65&&ch<=90){
//                bigCount++;
//            }else if(ch>=97&&ch<=122){
//                smallCount++;
//            }else if(ch>=48&&ch<=57){
//                numberCount++;
//            }
//        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                bigCount++;
            }else if(ch>='a'&&ch<='z'){
                smallCount++;
            }else if(ch>='0'&ch<='9'){
                numberCount++;
            }
        }
        //4.输出统计结果
        System.out.println("大写字母出现的次数："+bigCount);
        System.out.println("小写字母出现的次数："+smallCount);
        System.out.println("数字字符出现的次数："+numberCount);
    }
}
