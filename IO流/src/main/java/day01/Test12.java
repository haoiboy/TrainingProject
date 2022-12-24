package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test12 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.调用系统功能创建了文件 mayikt,txt
         * 2.创建字节输出流对象
         * 3.字节输出流对象指向文件
         */
        //指定写入文件的路径 需要抛出异常
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mayikt\\day04\\mayikt.txt");
        //写入数据到磁盘中
        fileOutputStream.write(98);
        fileOutputStream.write(97);
        fileOutputStream.write(99);
        fileOutputStream.write(100);
        fileOutputStream.write(101);
        fileOutputStream.write(102);
        //关闭字节输入流
        fileOutputStream.close();
    }
}
