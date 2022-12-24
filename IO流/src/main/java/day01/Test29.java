package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test29 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
       byte[] bytes=new byte[1024];
//        int len = inputStream.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
        int len;
//        while ((len=inputStream.read(bytes))>0){
        while ((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
            inputStream.close();
    }


}
