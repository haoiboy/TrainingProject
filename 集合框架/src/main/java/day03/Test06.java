package day03;

import java.util.HashMap;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i=0;i<=100;i++){
            hashMap.put(i+"",i+"");
//            System.out.println(i+","+i+"");
        }
        for (Map.Entry<String, String>entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
