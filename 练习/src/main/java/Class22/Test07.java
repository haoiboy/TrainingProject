package Class22;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            a1();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("您访问的数组下标越界了");
            e.printStackTrace();
        }
        System.out.println("结束");

        }
        public static void a1(){
            int[] arr1={1,6,9};
            System.out.println(arr1[3]);
        }
    }

