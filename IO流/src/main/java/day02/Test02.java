package day02;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("D:\\mayikt\\day04\\mayikt.txt"));
        //读取单个字符
        int read=inputStreamReader.read();
        System.out.println((char)read);

        inputStreamReader.close();
    }
}
