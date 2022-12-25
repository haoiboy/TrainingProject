package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("D:\\mayikt\\day04\\mayikt.txt"));
        char[] chars = new char[1024];
        int len = inputStreamReader.read(chars,0,2);
        System.out.println("实际读取到的长度:"+len);
//        System.out.println(Arrays.toString(chars));
        System.out.println(new String(chars,0,len));
        inputStreamReader.close();
    }
}
