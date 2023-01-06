package day02;

public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        MyLock myLock = new MyLock();
        myLock.Lock();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"start");
            myLock.Lock();
            System.out.println(Thread.currentThread().getName()+"end");
        }).start();
        Thread.sleep(3000);
        myLock.unLock();
    }
}
