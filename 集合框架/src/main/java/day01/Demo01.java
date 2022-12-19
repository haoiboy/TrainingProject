package day01;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String> strings=new LinkedList<>();
        strings.add("mayikt01");
        strings.add("mayikt02");
        strings.add("mayikt03");
        strings.remove(0);
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
    }
}
