package day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Class05 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("mayikt01", "yushengjun");
        hashMap.put("mayikt02", "wangmazi");
        hashMap.put("mayikt03", "xiaojun");
//使用方式2遍历HashMap 集合entrySet() map集合中键值对封装通过entry
//        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        for (Map . Entry<String, String>entry : entries) {
////            System. out . println(entry. getKey() + "," + entry. getValue());
////        }

//        for (String key : hashMap.keySet()) {
//            String value = hashMap.get(key);
//            System.out.println(key + "," + value);
//        }

        //方式3遍历HashMap集合
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
        System.out.println(entry.getKey() + " , " + entry.getValue());
    }}
}
