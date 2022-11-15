public class Class16 {
    public static void main(String[] args) {
        /**
         * 数字元素求和
         * 需求：有一个数组，元素是{71,27,33,22,100,87,77,57}
         * 要求：求和的元素个位和十位都不能是7,并且只能是偶数
         */
        //1.定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr={71,27,33,22,100,87,77,57};
        //2.定义一个求和变量，初始值为0
        int sum=0;
        for(int x=0;x<arr.length;x++){
            //满足条件：求和的元素个位和十位都不能是7，并且只能是偶数
            int temp=arr[x];
            if(temp%10!=7 && temp/10%10!=7 && temp%2==0){
                sum += arr[x];
            }
        }
        //输出求和变量的值
        System.out.println("sum:"+sum);
    }
}
