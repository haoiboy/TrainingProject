package Practice;

public class Class02 {
    public static void main(String[] args) {
        /**
         *  数组静态初始化
         *  数据类型[] 数组名= new 数据类型[] {元素1，元素2，元素3...};
         *  举例：int[] arr=new int[] {1,2,3};
         *  简化格式：数据类型[]数组名={元素1，元素2，元素3};
         *  int[] arr={1,2,3};
         */
        //       int[] arr=new int[]{1,2,3};
        //简化
//        int[] arr={1,2,3};
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        //数组的遍历
//        int[] arr={32,46,76,126};
//        for (int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }
        //arr.length 输出数组长度
//        int[] arr = {22, 33, 44, 55};
//    System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        int[] arr1 = {32, 54, 543};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//
//        }
        //定义一个数组存放数据
        int[] arr={157,167,178,179,165,190};
        //定义一个变量，存放临时的最大值
        int max=arr[0];
        //数组中剩余元素逐个进行比较
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("数组中的最大值:"+max);
    }
}