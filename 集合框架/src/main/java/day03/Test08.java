package day03;

import java.util.HashSet;
import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        //1.创建hashset集合
        HashSet<Integer> numbers=new HashSet<>();
        //2.生成的随机数都是存放在numbers
        Random random=new Random();
        //3.通过循环控制生成随机数 存放到hashset集合中
        while (numbers.size()<10){
            //将生成的随机数存放到hashset集合中 hashset保证元素不允许重复
            int number=random.nextInt(20)+1;
            numbers.add(number);
        }
        System.out.println("----------");
        System.out.println("以下是通过程序生成的随机数");
    for (Integer number:numbers){
        System.out.println(number);
    }
    }

}
