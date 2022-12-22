package day01;

import java.io.File;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //绝对路径 物理硬盘真实存放的路径
        //相对路径 Java工程中要访问的文件相对于当前文件的位置
        File file = new File("mayikt.java");
        System.out.println(file.createNewFile());
        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

    }
}
