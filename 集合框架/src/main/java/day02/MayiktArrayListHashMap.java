package day02;




import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Map;

public class MayiktArrayListHashMap<K, V> {

   private ArrayList<Entry<K,V>> arrayListEntrys =new ArrayList<Entry<K,V>>();
    class Entry<K,V> {
        K k;
        V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
}
    public void put(K k,V v) {
        arrayListEntrys.add(new Entry<>(k, v));
    }
        public V get (K k){
            for (Entry<K, V> entry : arrayListEntrys) {
                if (entry.k.equals(k)) {
                    return entry.v;
                }
            }
            return null;
        }


    public static void main(String[] args) {
        MayiktArrayListHashMap<Object, Object> mayiktArrayListHashMap = new MayiktArrayListHashMap<>();
        mayiktArrayListHashMap.put("mayikt01","meite");
        mayiktArrayListHashMap.put("mayikt02","shjka");
        System.out.println(mayiktArrayListHashMap.get("mayikt01"));
    }

    }


