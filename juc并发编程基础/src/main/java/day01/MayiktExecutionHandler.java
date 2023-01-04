package day01;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class MayiktExecutionHandler implements ThreadFactory, RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("自定义拒绝线程任务");
        r.run();
    }

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
