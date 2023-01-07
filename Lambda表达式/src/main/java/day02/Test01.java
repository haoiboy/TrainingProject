package day02;

import day01.OrderService;
import day01.OrderService1;

public class Test01 {
    public static void main(String[] args) {
        //最原生的匿名内部类调用方式
        OrderService1 orderService = new OrderService1() {
            @Override
            public void get(Integer a) {
                System.out.println("geta:"+a);
            }
        };
        orderService.get(1);
        //在lambda表达式中方法体直接引入方法
        OrderService1 orderService2=(a -> { Test01.staticGet(a);
            System.out.println("geta:"+a);
        });
        orderService2.get(2);
//方法引入写法
        OrderService1 orderService3=Test01::staticGet;
        orderService3.get(10);
    }
    public static void staticGet(Integer a){
        System.out.println("staticGet,a:"+a);

    }
}
