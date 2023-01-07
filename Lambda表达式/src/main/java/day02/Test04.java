package day02;

import java.util.function.Function;

public class Test04 {
    public static void main(String[] args) {
        //1.使用匿名内部类的形式
//        Tservice tservice1=new Tservice(){
//            @Override
//            public String get(Test04 test04){
//                return test04.objGet();
//            }
//        };
//        System.out.println(tservice1.get(new Test04()));

//        //2.lambda
////        Tservice tservice2= test04 -> test04.objGet();
////        System.out.println(tservice2.get(new Test04()));

////        //3.方法引入
////        Tservice tservice3=Test04::objGet;
////        System.out.println(tservice3.get(new Test04()));

        //R apply(T t) T: apply参数传递的类型，R:apply方法返回的类型
        Function<String,Integer>strFunction=(str)->{
            return str.length();
        };
        Function<String,Integer>function2= String::length;
        System.out.println(function2.apply("machao"));
    }

    public String objGet(){
        return  "zhaoyun";

    }
}
