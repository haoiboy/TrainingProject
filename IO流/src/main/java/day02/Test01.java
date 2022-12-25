package day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\mayikt\\day04\\mayikt.txt"));
        //1.一个字符一个字符输入
        outputStreamWriter.write('a');
        outputStreamWriter.write('b');
        outputStreamWriter.write('c');
        outputStreamWriter.write('d');
//2.直接写入一个char类型的数组
        char[] chars = {'a', 'b', 'c', 'd', '蚂', '蚁', '课', '堂'};
        outputStreamWriter.write(chars);
        outputStreamWriter.close();
//3写出字符数组cbuf中，从off开始，共len个字符
        outputStreamWriter.write(chars,0,2);
        outputStreamWriter.close();
        //4.写入一个字符串
        outputStreamWriter.write("mayikt中国");
        outputStreamWriter.close();
        //5.写入一个字符串 ,从off开始，共len个字符
        outputStreamWriter.write("mayikt中国",0,2);
        outputStreamWriter.close();
    }
}
