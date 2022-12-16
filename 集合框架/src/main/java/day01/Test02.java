package day01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("mayikt1");
        linkedList.add("mayikt2");
        linkedList.add("mayikt3");
        System.out.println(linkedList.size());
        Iterator<String>iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        linkedList.remove(0);
        System.out.println("删除之后的遍历结果");
        System.out.println(linkedList.size());
        Iterator<String> iterator1=linkedList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
