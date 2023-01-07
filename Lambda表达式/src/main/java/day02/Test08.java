package day02;

import java.util.Optional;

public class Test08 {
    private static  OrderEntry orderEntry;
    public static void main(String[] args) {
        System.out.println(Test08.getOrder());
        System.out.println(Test08.orderEntry);

    }
    private static OrderEntry getOrder(){
        //优化前
//        if (orderEntry==null){
//            orderEntry=createOrder();
//        }
        //orElseGet--写函数的接口的形式 赋默认值
        //orElse --直接传递默认值
       return Optional.ofNullable(orderEntry).orElseGet(Test08::orElseGet);

//        return orderEntry;
    }
    private static OrderEntry createOrder(){
        return new OrderEntry("123456","machao");
    }
    private static OrderEntry orElseGet(){
        orderEntry=createOrder();
        return orderEntry;
    }
}
