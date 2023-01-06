package day01;

public class Test02 {
    public static void main(String[] args) {
        //使用匿名内部类的方法调用Orderservice中get方法
//        ((OrderService) () -> System.out.println("get")).get();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ",run")).start();

    }
}
