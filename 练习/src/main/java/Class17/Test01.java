package Class17;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        //生成随机数 jdk 官方提供 随机数
        Random random = new Random();
        //0-100 random.nextInt(101);0-指定值-1
        int i=random.nextInt(101);
        System.out.println(i);
    }
}
