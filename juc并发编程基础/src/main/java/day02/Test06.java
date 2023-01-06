package day02;

import java.util.concurrent.CountDownLatch;

public class Test06 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                System.out.println("t1开始执行.....");
                countDownLatch.await();
                System.out.println("t1结束执行.....");
            }catch (Exception e){
                e.printStackTrace();
            }
        },"t1").start();
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}
