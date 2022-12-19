package day01;

import java.util.HashSet;
import java.util.Iterator;

public class Class02 {
    public static void main(String[] args) {
        HashSet<String>strings=new HashSet<>();
        strings.add("mayikt01");
        strings.add("mayikt02");
        strings.add("mayikt03");
        strings.add("mayikt03");
        strings.add(null);
        Iterator <String>iterator=strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
