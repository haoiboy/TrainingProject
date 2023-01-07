package day02;

import java.util.Optional;

public class Test05 {
    public static void main(String[] args) {
        String userName=null;
        /**
         *ofNullable允许传递一个空值对象
         * of不允许传递空值对象
         */
        Optional<String> optional=Optional.ofNullable(userName);

//        Optional<String> optional=Optional.of(userName);
//        System.out.println(optional.get());
        boolean present = optional.isPresent();
        System.out.println(present);

    }
}
