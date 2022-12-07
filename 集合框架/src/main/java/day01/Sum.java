package day01;

public class Sum {
    public static void main(String[] args) {

        int sum1=sum(1,1);
        System.out.println("sum:"+sum1);
        int sum2=sum(2,2,2);
        System.out.println("sum:"+sum2);
        int sum3=sum(3,3,3,3);
        System.out.println("sum:"+sum3);
        int sum4=sum(5,5,5,5,5);
        System.out.println("sum"+sum4);
    }
    public static int sum(int...a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum += a[i];
//        System.out.println(a[i]);

    }System.out.println("-------------");
        return sum;
}
}
