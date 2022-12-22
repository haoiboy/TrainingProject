package day03;

import java.util.HashSet;

public class Test07 {
    public static void main(String[] args) {
        HashSet<String> strings=new HashSet<>();
        strings.add("mayikt01");
        strings.add("mayikt01");
        for (String str:strings){
            System.out.println(str);
        }
    }
}
