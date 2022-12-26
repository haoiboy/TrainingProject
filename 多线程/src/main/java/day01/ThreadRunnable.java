package day01;

public class ThreadRunnable implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName()+"<我是子线程>");
    }

    public static void main(String[] args) {
        //启动线程
//        new Thread(new ThreadRunnable()).start();
        //2.使用匿名内部类的形式创建线程
      new  Thread (new Runnable(){
          public void run() {
              System.out.println(Thread.currentThread().getName()+"<我是子线程>");
          }
      }).start();
//     new Thread(() ->
//    System.out.println(Thread.currentThread().getName()+"<我是子线程>"),"mayikt蚂蚁课堂").start();
    }
}
