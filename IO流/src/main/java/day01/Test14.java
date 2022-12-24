package day01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test14 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("D:\\mayikt\\day04\\mayikt.txt");
//        String str="mayiktmeite666";
        for (int i=0;i<10;i++){
            f.write("meite".getBytes());
            f.write("\n".getBytes());
        }
//        f.write("mayiktmeite666".getBytes());
        f.close();

    }
}
