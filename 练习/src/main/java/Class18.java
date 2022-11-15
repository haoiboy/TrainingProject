import java.util.Scanner;

public class Class18 {
    public static void main(String[] args) {
        /**
         * 已知一个数组arr={29,68,33,44,10};
         * 键盘录入一个数据，查找该数据在数组中的索引
         * 并在控制台输出找到的索引值
         * 如果没有找到，输出-1
         */
        //1.定义一个数组
        int[] arr={29,68,33,44,10};
        System.out.println("用户请您输入数据：");
        //2.键盘录入数据
        Scanner scanner=new Scanner(System.in);
        //3.获取到用户输入的数据
        int userData = scanner.nextInt();
        //4.int index=-1
        int index=-1;
        //5.循环遍历整个数组
        for (int i=0;i<arr.length;i++){
            if(userData==arr[i]){
                index=i;
            }
        }
        System.out.println("查到该数据的位置："+index);

    }

    /**
     * 根据用户输入的一个数据，查找该数据在数组中对应的位置
     * @param userData 用户输入的数据
     * @return 在数组中 对应的index位置
     */
    public  int getIndex(int userData){
        return  -1;
    }
}
