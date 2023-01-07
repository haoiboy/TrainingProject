package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        Stream<UserEntry> stream = userEntries.stream();
        //where username='zhangsan' and age>18
        Stream<UserEntry> stream1 = userEntries.stream();
        stream.filter(userEntry -> "zhangsan".equals(userEntry.getUserName())&& userEntry.getAge()>18).forEach(userEntry -> System.out.println(userEntry));
    }
}
