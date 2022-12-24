package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
        byte[] bytes=new byte[13];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        inputStream.close();

    }
}
