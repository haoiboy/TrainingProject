package day02;

import java.util.Optional;
import java.util.function.Consumer;

public class Test07 {
    public static void main(String[] args) {
        String userName=null;
        Optional<String> optional=Optional.ofNullable(userName);
//        boolean present = optional.isPresent();
////        if (present){
////            System.out.println(optional.get());
////        }
        //username不为空的情况下，直接调用accep打印值username=null的情况下 就不会执行accept
        optional.ifPresent(s -> System.out.println(s));
        optional.ifPresent(System.out::print);

    }
}
