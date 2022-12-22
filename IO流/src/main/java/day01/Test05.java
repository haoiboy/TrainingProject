package day01;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File file = new File("D:\\mayikt");
        //获取该file完整路径地址 绝对路径地址
        System.out.println(file.getAbsolutePath());
        //获取抽象路径名转化路径名字符串
        System.out.println(file.getPath());
        //如果该路径是一个文件路径获取到的就是文件名称.后缀如果该路径是一 个文件夹路径 获取到是文件夹名称
        System.out.println(file.getName());
        System.out.println("----返回字符串类型-----");
        String[] list=file.list();
        for (String str:list){
            System.out.println(str);
        }
        System.out.println("-----返回文件类型--------");
        File[] files = file.listFiles();
        for (File file1:files){
            System.out.println(file1.getName());
        }

    }
}
