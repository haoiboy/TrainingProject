package day01;

import java.io.File;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\mayikt\\meite.java");
        if (file.exists()){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
            file.createNewFile();
            System.out.println("程序自动创建改文件");
        }


    }
}
