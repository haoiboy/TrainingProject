package day02;

public class Thread03 extends Thread{
    private static int sum=0;

@Override
    public void run(){
        sum();
    }
    public void sum(){
        for (int i=0;i<=10000;i++){
            sum++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread03 t1 = new Thread03();
        Thread03 t2 = new Thread03();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
