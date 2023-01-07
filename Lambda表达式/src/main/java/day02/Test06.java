package day02;

import java.util.Optional;
import java.util.function.Predicate;

public class Test06 {
    public static void main(String[] args) {
        String userName="machao";
//        String uName = Optional.ofNullable(userName).orElse("machao");
//        System.out.println(uName);
      boolean f= Optional.ofNullable(userName).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("machao");
            }
        }).isPresent();
        System.out.println(f);
    }
}
