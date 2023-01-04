package day01;

import java.util.concurrent.LinkedBlockingQueue;

public class Test01 {
    public static void main(String[] args) {
        //有界和无界的区别：有界对容量有限制 无界没有限制（Integer.MAX_VAULE）
        LinkedBlockingQueue<String> strings = new LinkedBlockingQueue<String>(3);
        strings.add("mayikt");
        strings.add("xiaowei");
        strings.add("xiaoan");
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll());
    }
}
