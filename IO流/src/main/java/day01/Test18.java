package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test18 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
        System.out.println("第一次读取数据：");
        byte[] bytes=new byte[5];
        int len=fileInputStream.read(bytes);
     //   System.out.println(len);
        System.out.println(new String(bytes));
        System.out.println("第二次读取数据");
        len=fileInputStream.read(bytes);
      //   System.out.println(len);
        System.out.println(new String(bytes));
        System.out.println("第三次读取数据");
        len=fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes,0,len));
        fileInputStream.close();
    }
}
