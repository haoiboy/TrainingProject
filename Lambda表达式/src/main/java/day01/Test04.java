package day01;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张飞");
        strings.add("赵云");
        strings.add("马超");
//        strings.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        strings.forEach(s -> {
            System.out.println(s);
        });


    }
}
