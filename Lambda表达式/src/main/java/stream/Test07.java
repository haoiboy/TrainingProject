package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        Stream<UserEntry> stream = userEntries.stream();
        userEntries.stream();
        //skip开始 limit结束
//        stream.limit(2).forEach(userEntry -> System.out.println(userEntry));
        stream.skip(2).limit(2).forEach(userEntry -> System.out.println(userEntry));
    }
}
