package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        Stream<UserEntry> stream = userEntries.stream();
        Optional<UserEntry> max = stream.max((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(max.get());
    }



}
