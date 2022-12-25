package day02;

import java.io.*;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //使用字符流读取到mayikt\\mayikt.txt到程序中
        //将读取到文本文件内容到D：\\mayikt
        //1.字符输入流
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("D:\\mayikt\\day04\\mayikt.txt"));
        //2.字符输出流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("D:\\mayikt\\day01\\mayikt.txt"));
        char[] chars = new char[1024];
        int len;
        while ((len=inputStreamReader.read(chars))!=-1){
outputStreamWriter.write(chars,0,len);
        }
        inputStreamReader.close();
outputStreamWriter.close();
    }
}
