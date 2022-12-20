package day02;

import java.util.HashMap;
import java.util.Map;

public class Class01 {
    public static void main(String[] args) {
        Map<String,String>hashMap=new HashMap<>();
        hashMap.put(null,"11");
        hashMap.forEach((K,V)->{
            System.out.println(K+","+V);
        });
    }


    }

