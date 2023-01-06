package stream;

import day01.UserEntry;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        /**
         * 创见stream流两种方式
         * 1。串行流stream();单线程
         * 2.并行流parallelStream();多线程 效率高
         *
         */
        Stream<UserEntry> stream = userEntries.stream();
        //转换成set集合
        Set<UserEntry> setUserList = stream.collect(Collectors.toSet());
        setUserList.forEach(userEntry -> {
            System.out.println(userEntry.toString());
        });
//        Stream<UserEntry> userEntryStream = userEntries.parallelStream();



    }
}
