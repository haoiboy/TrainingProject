package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        userEntries.add(new UserEntry("maji",35));
        userEntries.add(new UserEntry("maji",14));
        userEntries.add(new UserEntry("maji",75));
        //要求 对数据流的数据实现降序排列  且名称包含maji 获取前两位
        Stream<UserEntry> stream = userEntries.stream();
        userEntries.stream();
        stream.sorted((o1, o2) -> o2.getAge() - o1.getAge()).filter(new Predicate<UserEntry>() {
            @Override
            public boolean test(UserEntry userEntry) {
                return "maji".equals(userEntry.getUserName());
            }
            //.skip(2).forEach(userEntry -> System.out.println(userEntry.toString()));
        }).limit(2).forEach(userEntry -> System.out.println(userEntry.toString()));

    }
}
