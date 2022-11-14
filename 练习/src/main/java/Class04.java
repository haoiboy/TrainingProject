public class Class04 {
    public static void main(String[] args) {
//        //通过main主程序调用getMax方法
//        getMax(10,20);
//    }
//    //定义一个方法
//    public  static void getMax(){
//        int a=10;
//        int b=20;
//        int max=a>b?a:b;
//        System.out.println("max:"+max);
//    }
//        int a=109;
//        int b=60;
        getMax(109,60);
}
public  static void getMax(int a,int b){
    System.out.println("方法参数1(a):"+a);
    System.out.println("方法参数2(b):"+b);
    int max=a>b?a:b;
    //返回最大值
    System.out.println("max:"+max);
    }
}
