package day01;

import java.sql.Time;
import java.util.concurrent.*;

public class MyThreadPoolExecutor {
    public static ExecutorService newFixedThreadPool(
            int corePoolSize,int maximumPoolSize, int blockingQueue){
        return new ThreadPoolExecutor(corePoolSize,maximumPoolSize, 60L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(blockingQueue),
                (RejectedExecutionHandler)new MayiktExecutionHandler());
    }


}
