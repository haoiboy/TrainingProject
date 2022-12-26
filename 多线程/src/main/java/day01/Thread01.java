package day01;

public class Thread01 extends  Thread{
    /**
     * 线程执行的代码  在run方法中 执行完毕 线程死亡
     */

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"<我是子线程>");
        try {
Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+"<阻塞完毕>");
    }

    public static void main(String[] args) {
        //启动线程 调用start方法而不是run方法
        System.out.println(Thread.currentThread().getName());
        //调用start线程是不是立即被cpu调度执行 就绪状态-----等待CPU调度 线程从 就绪到运行状态
        new  Thread01().start();
        new  Thread01().start();
    }
}
