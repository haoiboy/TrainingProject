package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test07 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        MayiktIterator mayiktIterator = new MayiktIterator(list);
        System.out.println("使用迭代器遍历集合中的元素");
        System.out.println(mayiktIterator.next());
        System.out.println(mayiktIterator.next());
        System.out.println(mayiktIterator.next());
//        System.out.println(mayiktIterator.next());
    }
}
