package day01;

import java.io.*;

public class Test22 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();
    }
}
