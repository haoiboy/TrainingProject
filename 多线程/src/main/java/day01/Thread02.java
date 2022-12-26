package day01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class Thread02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(threadCallable);
        new   Thread(integerFutureTask).start();
        //主线程需要等待子线程的返回结果
        Integer result1=integerFutureTask.get();
        System.out.println(Thread.currentThread().getName()+","+result1);
        //LockSupport.park();
        //LockSupport.unpark();
        Thread thread01 = new Thread(new Runnable(){
            public void run(){
                System.out.println("我是子线程开始");
                LockSupport.park();
                System.out.println("我是子线程结束");
            }
        });
        thread01.start();
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        LockSupport.unpark(thread01);

    }
}
