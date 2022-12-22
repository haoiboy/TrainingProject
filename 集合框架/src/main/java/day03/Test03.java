package day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character key=str.charAt(i);
            Integer value=hashMap.get(key);
            if (value==null){
                value=1;
            }else {
                value++;
            }
            hashMap.put(key,value);
        }
        for (Map.Entry<Character,Integer>entry:hashMap.entrySet()){
            System.out.println("字符串："+entry.getKey());
            System.out.println("出现的次数："+entry.getValue());
            System.out.println("---------------");
        }
    }
}
