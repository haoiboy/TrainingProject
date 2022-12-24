package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\mayikt\\day04\\mayikt.txt"));
        byte[] bytes={98,95,96,97,99};
fileOutputStream.write(bytes,1,bytes.length-1);
    }
}
