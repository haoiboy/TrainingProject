package day02;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\mayikt\\day04\\mayikt.txt"));
        String s;
                while ((s=bufferedReader.readLine())!=null){
                    System.out.println(s);

                }
                bufferedReader.close();
    }
}
