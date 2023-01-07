package stream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class Test11 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream longStream = LongStream.rangeClosed(0, 50000000000L);
        OptionalLong result = longStream.parallel().reduce((left, right) -> left + right);
        System.out.println(result.getAsLong());
        Instant end = Instant.now();
        //使用并行流计算  8030
        System.out.println("五百亿求和时间："+ Duration.between(start,end).toMillis());
    }
}
