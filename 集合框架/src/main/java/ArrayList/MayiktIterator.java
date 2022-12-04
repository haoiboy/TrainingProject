package ArrayList;

import java.util.List;

public class MayiktIterator {
    private List list;
    public  MayiktIterator(List list){
        this.list=list;
    }
    private int count=0;
    public Object next(){
        if (list==null){
            throw new MayiktException("list is null");
        }
        if (count>=list.size()){
throw new MayiktException("无法继续向下获取元素啦");
        }
        return list.get(count++);
    }
    public boolean hasNext(){//hasNext()判断集合中是否还可以获取元素 如果能够获取元素则返回true
//        if (count==list.size()){//取次数==list.size()集合中 个数相等
//
//        }
        /**
         * 例如 集合中存了三个元素 list.size()==3
         * 分析场景
         * 1、第一次去调用next方法count=1  1 ！=list.size()=true可以继续调用 next方法
         * 2.第二次去调用next方法count=2   2！=list.size()=true可以继续调用 next方法
         * 3.第三次去调用next方法count=3 3==list.size() false
         */
        return  count!=list.size();
    }
}
