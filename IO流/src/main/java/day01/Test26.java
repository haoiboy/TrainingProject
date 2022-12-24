package day01;

import java.io.*;

public class Test26 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("D:\\mayikt\\day04\\mayikt.txt"),"UTF-8");

        outputStreamWriter.write("蚂蚁课堂\n于胜军\n66");
        outputStreamWriter.close();
        System.out.println("写入成功");
        System.out.println("开始读取文件");
        System.out.println("------------------------");
        InputStreamReader inputStreamReader= new InputStreamReader(
                new FileInputStream("D:\\mayikt\\day04\\mayikt.txt"),"GBK");
        char[] chars=new char[1024];
        int len;
        while ((len= inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
inputStreamReader.close();

    }
}
