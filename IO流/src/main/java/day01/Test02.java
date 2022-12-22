package day01;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file1= new File("D:\\mayikt\\mayikt.java");
        //createNewFile 如果能够成功创建文件 则返回true 不能够创建文件 则返回false
        System.out.println(file1.createNewFile());
        File file2 = new File("D:\\mayikt\\day01");
        System.out.println(file2.mkdir());
        File file3 = new File("D:\\mayikt\\day02\\javaweb\\spring");
        System.out.println(file3.mkdirs());

    }
}
