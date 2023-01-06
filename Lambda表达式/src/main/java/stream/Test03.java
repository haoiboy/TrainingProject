package stream;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(19,23,43,65);
        Optional<Integer> reduce=integerStream.reduce((a1, a2) -> a1+a2);
        System.out.println(reduce.get());
    }
}
