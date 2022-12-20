package day02;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        hashMap.put("mayikt01",new Student("小君",22));
        hashMap.put("mayikt02",new Student("小诶",21));
        hashMap.put("mayikt03",new Student("小为",20));
        hashMap.put("mayikt03",new Student("wixo",22));
for (String key:hashMap.keySet()){
    Student student=hashMap.get(key);
    System.out.println("学号:  "+key+"  姓名:  "+student.getName()+"  年龄:  "+student.getAge());
}
    }
}
