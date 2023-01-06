package day02;

import java.util.concurrent.atomic.AtomicInteger;

public class Test03 {
   private static AtomicInteger atomicInteger=new AtomicInteger(0);

    public static void main(String[] args) {
        //v=0 e=0 n=1
        boolean result1=atomicInteger.compareAndSet(0,1);
        //v=1 e=0 n=1
        boolean result2=atomicInteger.compareAndSet(1,2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(atomicInteger.get());
    }
}
