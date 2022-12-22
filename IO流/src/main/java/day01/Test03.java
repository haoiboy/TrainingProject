package day01;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
//        File file = new File("D:\\mayikt\\mayikt.java");
        String pathName="D:\\mayikt\\day02";
        File file=new File(pathName);
        System.out.println(pathName);
        //file.isDirectory 返回是true 他就是文件夹 false就不是文件夹

        if (file.isDirectory()){
            System.out.println("是文件夹");
        }else {
            System.out.println("不是文件夹");
        }
        //file.isFile() 返回true是文件 返回false不是文件
       if (file.isFile()){
           System.out.println("是一个文件");
       }else {
           System.out.println("不是一个文件");
       }
    }
}
