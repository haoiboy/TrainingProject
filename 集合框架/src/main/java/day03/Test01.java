package day03;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student("mayikt01",22),"1234567");
        hashMap.put(new Student("mayikt02",23),"12345678");

    }
}
