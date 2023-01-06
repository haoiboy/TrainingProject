package day02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class Test02 {
    public static void main(String[] args) {
         Thread t1=new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" start");
            //当前线程阻塞
            LockSupport.park();
            System.out.println(Thread.currentThread().getName()+" end");
        });
        t1.start();
        //唤醒阻塞的线程
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        LockSupport.unpark(t1);
    }
}
