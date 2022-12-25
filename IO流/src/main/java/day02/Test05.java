package day02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("D:\\mayikt\\day04\\mayikt.txt");
        FileWriter fileWriter = new FileWriter("D:\\mayikt\\day01\\mayikt.txt");
        int len;
        char[] chars = new char[1024];
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);
        }
        fileReader.close();
        fileWriter.close();
    }
}
