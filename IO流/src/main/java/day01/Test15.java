package day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test15 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream f = null;
        try {
           f = new FileOutputStream("D:\\mayikt\\day04\\meite.txt");
            f.write("mayikt".getBytes());
            int j = 1 / 0;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          if (f!=null){
                try {
                    f.close();
                    System.out.println("关闭IO资源成功");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
}