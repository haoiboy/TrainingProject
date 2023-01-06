package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        Stream<UserEntry> stream = userEntries.stream();
        boolean b=stream.anyMatch(userEntry -> "zhangsan".equals(userEntry.getUserName()));
        System.out.println(b);
    }
}
