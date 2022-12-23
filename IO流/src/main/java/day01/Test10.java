package day01;

public class Test10 {
    public static void main(String[] args) {
//        int n=5;
////        System.out.println(n*4*3*2*1);
        System.out.println(jc(10));
    }
    public static int jc(int n){
     if (n==1){
     return 1;
     }else{
    return n*jc(n-1);

     }
    }
}
