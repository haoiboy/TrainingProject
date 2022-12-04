package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<String> collection=new ArrayList<String>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
//        for (int i=0;i<collection.size();i++){
//            String s=collection.get(i);
//            System.out.println(s);
//        }
        Iterator<String> iterator=collection.iterator();
//        System.out.println("使用集合中专用迭代器遍历数据");
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        String next1=iterator.next();
        boolean b1=iterator.hasNext();
        System.out.println(b1);
        if (b1){
            System.out.println(iterator.next());
        }
        boolean b2=iterator.hasNext();
        System.out.println(b2);
        if (b2){
            System.out.println(iterator.next());
        } boolean b3=iterator.hasNext();
        System.out.println(b3);
        if (b3){
            System.out.println(iterator.next());
        } boolean b4=iterator.hasNext();
        System.out.println(b4);
        if (b4){
            System.out.println(iterator.next());
        }

//        String next2=iterator.next();
//        System.out.println("第2次调用next方法 返回的结果："+next2+",iterator.hasNext()"+iterator.hasNext());
//        String next3=iterator.next();
//        System.out.println("第3次调用next方法 返回的结果："+next3);
//        boolean b=iterator.hasNext();

//        System.out.println(b);

//        int count=0;
//        while (true){
//count++;
//            String n=iterator.next();
//            System.out.println("n:"+n);
//            //准备第四次退出循环
//            if (count>=3){
//                break;
//            }
//        }
//        System.out.println(iterator.hasNext());
       //计数器  count=0;
        System.out.println("使用迭代器 循环遍历数据");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
