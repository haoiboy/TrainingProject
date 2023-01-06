package day02;

import java.util.concurrent.Semaphore;

public class Test05 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i=0;i<10;i++){
            int finalI=i;
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+","+finalI);
                    semaphore.release();
                }catch (Exception e){

                }
            }).start();
        }

    }
}
