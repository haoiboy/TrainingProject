package day01;

import java.io.*;

public class Test21 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("D:\\mayikt\\day04\\mayikt.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write("mayikt\nmeite".getBytes());
        bufferedOutputStream.close();
    }
}
