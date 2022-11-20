package Practice;

import java.util.Scanner;

public class Class19 {
    /**
     * 根据用户输入的一个数据，查找该数据在数组中对应的位置
     * @param userData 用户输入的数据
     * @param arr 需要查找的数组
     * @return 在数组中 对应的index位置
     */
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr={29,68,33,44,10};
        System.out.println("用户请您输入数据：");
        //2.键盘录入数据
        Scanner scanner=new Scanner(System.in);
        //3.获取到用户输入的数据
        int userData = scanner.nextInt();
        int index= getIndex(userData,arr);
        //三元表达式
        System.out.println(index==-1?"很抱歉，没有找到该数据， 所以返回-1"
                :"查找到该数据，对应的index位置为 "+index);
    }
    public  static int getIndex(int userData ,int[] arr){
        //4.int index=-1
        int index=-1;
        //5.循环遍历整个数组
        for (int i=0;i<arr.length;i++){
            if(userData==arr[i]){
               return i;
            }
        }

        return  -1;
    }

}
