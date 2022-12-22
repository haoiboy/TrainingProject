package day01;

import java.io.File;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\mayikt\\day03");
        System.out.println(file.createNewFile());
        //file.delete 删除文件或者文件夹
        /**
         * 如果删除的是一个文件路径 则直接删除
         * 如果是文件夹路径，先删除里面的文件再删除文件夹
         */
        System.out.println(file.delete());
    }
}
