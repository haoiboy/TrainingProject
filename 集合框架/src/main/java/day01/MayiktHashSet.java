package day01;

import java.util.HashMap;
import java.util.HashSet;

public class MayiktHashSet<E> {
    private static final Object PRESENT=new Object();
    private HashMap<E,Object> map;
    public MayiktHashSet(){
        map=new HashMap<>();
    }
    public void add(E e){
        map.put(e,PRESENT);
    }

}
