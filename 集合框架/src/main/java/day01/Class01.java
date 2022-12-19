package day01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class Class01 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("mayikt01","张三");
        hashMap.put("mayikt02","赵四");
        hashMap.put("mayikt03","王五");
        hashMap.put("mayikt03","张飞");
        hashMap.put("mayikt03","关羽");
        hashMap.remove("mayikt02");
//        hashMap.clear();
        String value="关羽";
        if (hashMap.containsValue(value)){
            System.out.println("存在"+value);
        }else {
            System.out.println("不存在"+value);
        }
        String key="mayikt02";
        if (hashMap.containsKey(key)){
            System.out.println("存在"+key);

        }else {
            System.out.println( "不存在"+key);
               }
        System.out.println(hashMap);
        Map<String,String> hashMap2=new HashMap<>();
        hashMap2.put("mayikt04","马超");
        System.out.println(hashMap2.size());
        System.out.println(hashMap2.isEmpty());
    }
}
