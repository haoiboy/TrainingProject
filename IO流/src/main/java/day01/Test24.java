package day01;

import java.io.*;

public class Test24 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        a1();
       long endTime= System.currentTimeMillis();
        System.out.println("执行该程序耗时："+(endTime-startTime)+"毫秒");
    }public static void a1() throws IOException{
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
    public void a2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\mayikt\\day04\\mayikt.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mayikt\\day01\\mayikt.mp4");
        int b;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
