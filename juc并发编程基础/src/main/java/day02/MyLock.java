package day02;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class MyLock {
    private  AtomicInteger lockState=new AtomicInteger(0);
    private Thread getLockThread=null;
    private  ConcurrentLinkedDeque<Thread> concurrentLinkedDeque=new ConcurrentLinkedDeque<Thread>();

    public void Lock(){
        acquire();
//            lockState.compareAndSet(0,1);
    }
    public boolean acquire(){
        for (;;){
            System.out.println(Thread.currentThread().getName()+"cas操作");
            if (compareAndset(0,1)){
                //获取锁成功
                getLockThread=Thread.currentThread();
                return true;
            }
            //获取锁失败
            Thread thread = Thread.currentThread();
            concurrentLinkedDeque.add(thread);
            //阻塞
            LockSupport.park();
            return false;
        }
    }
    private boolean compareAndset(int expect, int update) {
        return lockState.compareAndSet(expect,update);
    }
    //释放锁
    public boolean  unLock(){
        if (getLockThread ==   null){
        return false;
        }
        if (getLockThread == Thread.currentThread()){
            boolean result = compareAndset(1, 0);
            if (result){
                //公平锁唤醒
                Thread first=concurrentLinkedDeque.getFirst();
                System.out.println(first.getName()+"被唤醒");
                LockSupport.unpark(first);
                return true;
            }
        }

    return false;
    }
}
