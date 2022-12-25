package day02;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("D:\\mayikt\\day04\\mayikt.txt"));
        bufferedWriter.write("mayikt蚂蚁课堂com");
        bufferedWriter.close();
        //2.
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\mayikt\\day01\\mayikt.txt"));
        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read())!=-1){
            System.out.println(new String(chars,0,len));
        }

        bufferedReader.close();
    }
}
