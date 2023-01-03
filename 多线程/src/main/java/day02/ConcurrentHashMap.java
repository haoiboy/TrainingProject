package day02;

import java.util.Hashtable;

public class ConcurrentHashMap<K,V> {
    //1.提前创建固定数组容量大小的 小的hashtable集合
    private Hashtable<K,V>[] hashtables;
    public ConcurrentHashMap(){
        Hashtable[] hashtables = new Hashtable[16];
        for (int i=0;i<hashtables.length;i++){
            hashtables[i] =new Hashtable();
        }
    }
          private void put(K k, V v){
        int hashTableIndex=k.hashCode() % hashtables.length;
        hashtables[hashTableIndex].put(k,v);
}
               private V get(K k){
    int hashTableIndex=k.hashCode() % hashtables.length;
    return hashtables[hashTableIndex].get(k);
}

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        concurrentHashMap.put("m","m");
        concurrentHashMap.put("k","k");
        System.out.println(concurrentHashMap.get("m"));
        System.out.println(concurrentHashMap.get("k"));

    }
}
