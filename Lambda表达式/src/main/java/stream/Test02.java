package stream;

import day01.UserEntry;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<UserEntry> userEntries = new ArrayList<>();
        userEntries.add(new UserEntry("zhangsan",22));
        userEntries.add(new UserEntry("guanyu",23));
        userEntries.add(new UserEntry("zhaofei",64));
        userEntries.add(new UserEntry("maji",27));
        //list集合只有元素值 key list转化为map集合的情况下 指定key--value user对象
        /**
         * map<String>(username),userEntry
         */
        Stream<UserEntry> stream = userEntries.stream();
        //new Function<UserEntity(List集 合中的类型)，String(key map)>
        Map<String,UserEntry>collect=stream.collect(Collectors.toMap(userEntry
                -> userEntry.getUserName(), userEntry -> userEntry));
        collect.forEach((BiConsumer) (o, o2) -> System.out.println(0+","+o2));
    }
}
