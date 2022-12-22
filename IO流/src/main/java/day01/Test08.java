package day01;

import java.io.File;
import java.lang.reflect.Field;

public class Test08 {
    public static void main(String[] args) {
        File file=new File("D:\\mayikt\\day03");
        if (file.isDirectory()){
            System.out.println("删除路径是一个文件夹目录");
            deletes(file);
        }
        if (file.isFile()){

delete(file);}}
    public static void deletes(File file){
        File[] files=file.listFiles();
       if(Filef:files){
            file.delete();
            System.out.println("删除文件"+f.getAbsolutePath());
        }
        file.delete();
        System.out.println("删除目录"+ file.getAbsolutePath());
    }
    public static void delete(File file){
        System.out.println("删除文件:"+file.getAbsolutePath());
    }
}
