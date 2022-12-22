package day03;

import java.util.ArrayList;
import java.util.HashMap;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> hashMaps=new ArrayList<>();
        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("mayikt","meite");
        HashMap<String,String> hashMap2= new HashMap<>();
        hashMap2.put("mayikt01","meite01");
        HashMap<String,String> hashMap3 = new HashMap<>();
        hashMap3.put("mayikt02","meite02");
        hashMaps.add(hashMap1);
        hashMaps.add(hashMap2);
        hashMaps.add(hashMap3);
        for(HashMap<String,String> hashMap:hashMaps){
            System.out.println(hashMap);
        }
    }
}
