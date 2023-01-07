package day02;

import java.util.Optional;

public class Test09 {
    public static void main(String[] args) {
        String orderName=Test09.getOrderName();
        System.out.println(orderName);
    }
    public static String getOrderName(){
        //优化前代码
OrderEntry order=new OrderEntry("123456","ZAHNGSAN");
        if (order!=null){
    String orderName=order.getOrderName();
    if (orderName!=null){
    return orderName.toLowerCase();
    }
}
        //获取对象中orderNameOptional
//        Optional<OrderEntry> orderOptional = Optional.ofNullable(order);
//        Optional<String>orderNameOptional=orderOptional.map(orderEntry -> orderEntry.getOrderName());
//        Optional<String> toLowerCase = orderNameOptional.map(name -> name.toLowerCase());
//       return toLowerCase.get();
//        Optional<String> orderNameOptional = Optional.ofNullable(order).map((orderEntry -> orderEntry.getOrderName()));
        return Optional.ofNullable(order).map(orderEntry ->
        orderEntry.getOrderName()).map(orderName->orderName.toLowerCase()).orElse(null);
    }
}
