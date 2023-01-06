package day02;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        /** V=共享变量=0.
         *线程1---- E=每个线程中都会缓存副本V的值----旧的预期值= =E=0 N=1
         *线程2----E=每个线程中都会缓存副本V的值----旧的预期值= =E=0 N=2
         * cas成功则需要V (共享变量值) =e (线程中内存缓存的值) cas修改成功将n赋值给我们的v
         */
        boolean b1 = atomicInteger . compareAndSet(  0, 1);
        boolean b2 = atomicInteger . compareAndSet(  1, 4);
        System.out.println(b1+"..."+atomicInteger.get());
        System.out.println(b2+"..."+atomicInteger.get());

    }
}
