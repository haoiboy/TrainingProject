package day01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class03 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap. put( "mayikt01","yushengjun");
        hashMap. put ( "mayikt02","wangmazi");
        hashMap. put("mayikt03", "meite");
        //1.根据键获取值
       System. out.println(hashMap. get( "mayikt01"));
        System. out . println(hashMap . get("lisi"));
        System.out.println("获取所有键的集合 （返回set集合）");
        //2.获取所有键的集合(返回Set集合)
        Set<String> strings = hashMap. keySet();
        for (String str : strings) {
            System. out. println(str);
        }
        // 3.获取所有值的集合(返回Collection集合)
        System. out . println("获取所有值的集合(返回Collection集合) ");
        Collection<String> values = hashMap. values();
        for (String str : values) {
            System. out . println(str);
        }
        // 4.获取所有键值对象的集合
        System. out. println("获取所有键值对象的集合");
        Set<Map. Entry<String,String>> entries = hashMap . entrySet();
        // HashMap 集合底层键值对如何封装就是通过Map接口中的Entry对象
        for (Map. Entry<String,String> entry :entries) {
            System. out. println(entry);
    }
        //5.如果存在相应的key则返回其对应的value，否则返回给定的默认值defaultValue。
        String mayikt01 = hashMap.getOrDefault( "wangmaziyushengjun" ,  "我是默认值");
        System. out. println(mayikt01);
}}
