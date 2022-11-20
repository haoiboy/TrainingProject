package Practice;

public class Class01 {
//     public  static  void  main(String[] args){
//           int sum=0;
//           for(int i=0;i<5;i++){
//               sum+=i;
//           }
//         System.out.println(sum);
//
//     }
//

    public static void main(String[] args) {
//int [] arr=new int[4];
//        System.out.println(arr);
//        System.out.println("arr[0]:"+arr[0]);
//        System.out.println("arr[1]:"+arr[1]);
//        System.out.println("arr[2]:"+arr[2]);
//        System.out.println("arr[3]:"+arr[3]);

//int[] arr1=new  int[2];
//int[] arr2=new int[4];
//        System.out.println(arr1);
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr2);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        arr1[0]=100;
//        arr2[0]=500;
//        System.out.println(arr1);
//        System.out.println(arr1[0]);
//        System.out.println(arr2);
//        System.out.println(arr2[0]);

        int[] arr1=new int[2];
        arr1[0]=100;
        arr1[1]=200;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        int[] arr2=arr1;
        arr2[0]=300;
        arr2[1]=40;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}