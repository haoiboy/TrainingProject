package day02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("D:\\mayikt\\day04\\mayikt.txt"));
        for (int i=1;i<=100;i++){
            bufferedWriter.write("mayikt"+i);
            bufferedWriter.write("\r\n");

        }
        bufferedWriter.close();
    }
}
