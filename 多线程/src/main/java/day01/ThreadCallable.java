package day01;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        try {
Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+"返回1");
        return 1;
    }
}
