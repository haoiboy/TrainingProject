package day01;

import java.util.HashMap;
import java.util.Set;

public class Class04 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap. put("mayikt01","yushengjun");
        hashMap . put ( "mayikt02", "wangmazi");
        hashMap. put( "mayikt03", "xiaojun");
        //方式一遍历我们的 HashMap集合
        /*** 1. 先获取到HashMap中所有的键值
         * 2.就可以调用get方法获取对应键值的value值
         *
         */

        Set<String> keys = hashMap . keySet();
        for (String key :keys) {
            System. out . println(key);
String value=hashMap.get(key);
            System.out.println(key+","+value);

    }
}}
