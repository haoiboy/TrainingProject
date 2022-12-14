package day02;

public class MayiktHashMap<K ,V> {
    private Entry[] entrys=new Entry[10000];
    class Entry<K,V> {
        K k;
        V v;
        int hash;
Entry<K,V> next;
        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
    public void put(K k,V v){
        /**
         * 1.根据key的hashcode 取余entrys.length 余数该 key存放
         * 在我们的数组对应的index位置
         */
        int index=k.hashCode()%entrys.length;
       Entry oldEntry=entrys[index];
       if (oldEntry==null){
           entrys[index]=new Entry<> (k,v);
       }else {
oldEntry.next=new Entry<>(k,v);
       }

    }
    public V get(K k){
        /**
         *
         */
        int index=k.hashCode()%entrys.length;
        return (V) entrys[index].v;
    }

    public static void main(String[] args) {
        MayiktHashMap<Object, Object> hashMap = new MayiktHashMap<>();
        hashMap.put("a","a");
        hashMap.put(97,"97");
        System.out.println(hashMap.get("a"));
    }
}
