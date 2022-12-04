package ArrayList;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test08 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("mayikt01");
       collection.add("mayikt02");
       collection.add("mayikt03");
      collection.add("mayikt04");
        //get在list接口中  java多态机制
        /**
         * collection接口中没有get方法
         * 多态机制---编译看左边
         */
        List list=(List)  collection;
        list.set(1,"mayikt666");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(list.get(0));
    }
    /**
     * collection只提供 集合一些基本的方法
     * 具体实现List ArrayList   需要重写实现List接口
     * List集合下 都是有序的接口 根据存放顺序 可以允许存放重复 set接口不允许
     */
}
