package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test17 {
    public static void main(String[] args) throws IOException {
        //读取到磁盘中
        FileInputStream input = new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
   //写入到"D:\\mayikt\\mayikt01\\mayikt.txt"
        FileOutputStream output = new FileOutputStream("D:\\mayikt\\day01\\mayikt01.txt");
        int by;
        while ((by=input.read())!=-1){
            //写入数据到磁盘中
    output.write(by);
        }
        input.close();
        output.close();

    }
}
