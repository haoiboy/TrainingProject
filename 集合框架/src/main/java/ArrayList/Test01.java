package ArrayList;

import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        /**
         * new ArrayList<泛型> 必须使用引用类型 若要用基本类型，只能使用它的包装类
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("mayikt1");
        arrayList.add("mayikt2");
        arrayList.add("mayikt3");
        arrayList.add("mayikt4");
        System.out.println("集合中存入的元素:"+arrayList.size());
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.get(3));
        /**ArrayList底层基于数组实现
         *
         */
    for (int i=0;i<arrayList.size();i++){
        System.out.println(arrayList.get(i));
    }
        System.out.println("--------修改后数据--------");
//    arrayList.set(1,"wangmazi");
        String oldVaule = arrayList.set(1, "wangmazi");//返回修改之前的元素值
        System.out.println(oldVaule);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------删除index为1------");
//        arrayList.remove(1);
        String remove = arrayList.remove(1);
        System.out.println(remove);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
