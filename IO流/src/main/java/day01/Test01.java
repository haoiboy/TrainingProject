package day01;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        /**
         *  java io包下
         *  I0对磁盘中的 文件操作(增加、修改、删除、查询)
         * /
         //File(String pathname) 通过将给定的路径名,字符串转换为抽象路径名来创建新的File实例
         /**
         *填写磁盘路径
         * D:\mayikt
         * D:\\mayikt
         */
        //1.File(String pathname) 通过将给定的路径名,字符串转换为抽象路径名来创建新的File实例
        File file1 = new File( "D: \\mayikt\\mayikt . txt");
        System.out.println(file1);
        //2.File(String parent, String child)
        File file2 = new File(  "D: \\mayikt\\", "mayikt . txt");
        System. out. println(file2);
        File file3 = new File(  "D: \\mayikt\\");
        File file4 = new File(file3, "mayikt.txt");
        System.out.println(file4);
    }
}
