package day01;

import java.util.ArrayList;
import java.util.Comparator;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userLists = new ArrayList<>();
        userLists.add(new UserEntry("xiaoming",12));
        userLists.add(new UserEntry("xiaoxiao",6));
        userLists.add(new UserEntry("xiaojun",23));
        userLists.sort((o1, o2) -> o1.getAge()-o2.getAge());
        userLists.forEach((t)->{
            System.out.println(t.toString());
        });
    }
}
