package day01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            public void run(){
                System.out.println(Thread.currentThread().getName()+"我是线程池");}
        });
        // executorService.execute(new Runnable(()->System.out.println(Thread.currentThread().getName()+"我是线程池");}

    }
}

