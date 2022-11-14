public class Class11 {
    public static void main(String[] args) {
        int[] arr={30,60,90};
        System.out.println("调用方法前："+arr[0]);
        change(arr);
        System.out.println("调用方法后："+arr[0]);
    }
    public static void change(int[] arr){
        arr[0]=100;
    }
}
