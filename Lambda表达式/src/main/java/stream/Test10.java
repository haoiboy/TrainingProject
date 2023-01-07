package stream;

import java.time.Duration;
import java.time.Instant;

public class Test10 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        long sum=0;
        for (long i=0;i<=50000000000L;i++){
            sum+=i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        //单线程：五百亿求和花费的时间为：12956
        System.out.println("五百亿求和花费时间为："+ Duration.between(start,end).toMillis());

    }
}
