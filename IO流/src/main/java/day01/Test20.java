package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test20 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\mayikt\\day04\\OIP-C.png");
        byte[] bytes= new byte[1024];
        int len;
        FileOutputStream outputStream = new FileOutputStream("D:\\mayikt\\day01\\OIP-C.png");
        while ((len=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }

        inputStream.close();
        outputStream.close();
    }

}
