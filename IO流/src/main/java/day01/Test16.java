package day01;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test16 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream("D:\\mayikt\\day04\\mayikt.txt");
            System.out.println("读取到的文件内容：");
//            int read=fileInputStream.read();
//            System.out.println((char)read1);
//            int read2=fileInputStream.read();
//            System.out.println((char)read2);
//            int read3=fileInputStream.read();
//            System.out.println((char)read3);
//            int read4=fileInputStream.read();
//            System.out.println((char)read4);
//while (read!=-1){
//    System.out.println((char)read);
//    read=fileInputStream.read();
            int read;
            while ((read=fileInputStream.read())!=-1){
                System.out.print((char) read);
}
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
