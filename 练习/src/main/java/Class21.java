public class Class21 {
    public static void main(String[] args) {
        /**
         * 反转数组
         */
        int[] arr={12,11,45,13,94};
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        System.out.print("反转后的数组为：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }

        }
    }
}
