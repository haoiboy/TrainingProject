package day01;

import java.util.concurrent.ExecutorService;

    /**
     * 1.提交的线程任务数<核心线程数(核心线程数任务复用)
     * 2.提交的线程任务数>核心线程数且我们队列容量没有满将该任务缨存到我们队列中
     *3 4 5 6 7缓存到我们队列中
     *  3.提交的线程任务t>核心线程数且我们队列容量游了
     *   8,9，10
     * 最多在额外创建两个线程4-2 2个线程
     *   2个线程8 ,9
     *   10个任务----拒绝
    */
public class Test02 {
    public static void main(String[] args) {
        ExecutorService executorService = MyThreadPoolExecutor.newFixedThreadPool(2, 4, 5);
        for (int i=1;i<11;i++){
            final int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+","+ finalI);
                }
            });
        }

            //实际上最多执行多少个任务核心线程数+缓存队列的容量+最大线程数-核心线程数

    }
}
