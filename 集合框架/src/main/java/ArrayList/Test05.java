package ArrayList;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        /**
         * List接口下 实现类arrayList Linkedlist 存入数据 都是保证有序性 允许存入数据
         * 可以重复
         * arraylist存入数据 是否 保证数据的存入有序性----保证
         */
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int i=0;i<10;i++ ){
            arrayList.add("i："+i);
        }
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
