package Practice;

public class Class13 {
    public static void main(String[] args) {
        int[] arr={234,23,423,43,534};
        int max=getMax(arr);
        System.out.println("定义方法查找数组中的最大值："+max);

    }
    public  static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
            return max;
    }
}
