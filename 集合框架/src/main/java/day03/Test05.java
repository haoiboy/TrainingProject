package day03;

import java.util.ArrayList;
import java.util.Collections;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(88);
        integers.add(33);
        integers.add(99);
        integers.add(53);
        integers.add(100);
//        Collections.sort(integers);
        Collections.reverse(integers);
        for (Integer i:integers){
            System.out.println(i);
        }

    }
}
