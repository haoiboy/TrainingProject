package day01;

import java.io.*;

public class Test23 {
    public static void main(String[] args) throws IOException {
        //创建字节输入缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("D:\\mayikt\\day04\\mayikt.mp4"));
        //创建字节输出缓冲流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("D:\\mayikt\\day01\\mayikt.mp4"));
        int len;
        byte[] bytes = new byte[2024];
        while ((len=bufferedInputStream.read(bytes))!=-1){
bufferedOutputStream.write(bytes,0,len);
        }
bufferedInputStream.close();
bufferedOutputStream.close();
    }
}
