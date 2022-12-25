package day02;

import java.io.*;

public class Test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\mayikt\\day04\\mayikt.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("D:\\mayikt\\day01\\mayikt.java"));
        String s;
        while ((s=bufferedReader.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
