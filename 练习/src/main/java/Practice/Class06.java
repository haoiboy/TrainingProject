package Practice;

public class Class06 {
    public  static int getMax(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {
int max1=getMax(50,60);
int max2=getMax(160,240);
        System.out.println("max1:"+max1);
        System.out.println("max2:"+max2);
    }
}
