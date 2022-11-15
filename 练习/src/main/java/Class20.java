import java.util.Scanner;

public class Class20 {
    public static void main(String[] args) {
        /**
         * 评委打分：有6个评委为参赛选手打分，分数为0~100分的整数分
         * 选手的最后得分，去掉一个最高分和一个最低分的4个值的平均数
         * 分析：
         * 1.定义一个长度为6的数组
         * 2.键盘录入评委打的分数录入数组中
         * 3.写方法获取最高分getMax,最低分getMin
         * 4.写方法求评委的分数和sum
         * 5.平均分：（和-最大值-最小值）/(arr.length-2)
         * 6.输出平均分avg
         */
      //  1.定义一个长度为6的数组
        int[] arr=new int[6];
       // 2.键盘录入评委打的分数录入数组中
        for (int i=0;i<arr.length;i++){
            System.out.println("需要输入第"+(i+1)+"一个评委打的分数");
            Scanner scanner=new Scanner(System.in);
            arr[i]=scanner.nextInt();
        }
        System.out.println("遍历数组中的元素值：");
        for(int i=0;i<arr.length;i++){
            System.out.println("i:"+arr[i]);
        }

        int max = getMax(arr);
        System.out.println("max:"+max);
        int min = getMin(arr);
        System.out.println("min:"+min);
        int sum=getSum(arr);
        //获取平均分
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("avg:"+avg);


    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
              return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
    //定义一个临时变量总分和sum
    public static int getSum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){

                sum+=arr[i];
            }


        return sum;
    }
}
