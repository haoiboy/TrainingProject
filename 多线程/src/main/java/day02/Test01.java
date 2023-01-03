package day02;

public class Test01 {
    private Object objectLock=new Object();
    public static void main(String[] args) throws InterruptedException {
new Test01().print();

  }

    public void print() throws InterruptedException {
        new Thread(new Runnable() {
            public void run() {
                synchronized (objectLock){
                    System.out.println(Thread.currentThread().getName()+">1<");
                    try { //this.wait();释放锁资源，同时线程会阻塞
//        objectLock.wait();
//        objectLock.notify();
                        objectLock.wait();
                    }catch (Exception e){
                    }
                    System.out.println(Thread.currentThread().getName()+">2<");
                }}
        }).start();
try{
    Thread.sleep(3000);
//    objectLock.wait();
    synchronized (objectLock){
        objectLock.notify();

    }

}catch (Exception e){
e.printStackTrace();

}
}}
