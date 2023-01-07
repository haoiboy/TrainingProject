package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        Stream<UserEntry> stream = userEntries.stream();
        userEntries.stream();
        stream.sorted((o1, o2) -> {
            return o1.getAge()-o2.getAge();//升序
            //return o2.getAge-o1.getAge();//降序
        }).forEach((userEntry -> System.out.println(userEntry.toString())));
    }
}
