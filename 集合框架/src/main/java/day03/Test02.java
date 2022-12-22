package day03;

import java.util.ArrayList;
import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String>hubei=new ArrayList<>();
        hubei.add("武汉市");
        hubei.add("孝感市");
        hubei.add("宜昌市");
        hubei.add("鄂州市");
        hashMap.put("湖北省",hubei);
        ArrayList<String>jiangsu=new ArrayList<>();
        jiangsu.add("南京市");
        jiangsu.add("无锡市");
        jiangsu.add("苏州市");
        hashMap.put("江苏省",jiangsu);
        for (String key:hashMap.keySet()){
            System.out.println("省份："+key);
            System.out.println("城市：");
            System.out.println(hashMap.get(key));
            System.out.println("------------");
        }
    }
}
