public class Class08 {
    public  static boolean isNumber(int number) {
        if (number % 2 == 0) {
return true;//返回true就是奇数
        }
        return false;//返回false就是偶数
    }

    public static void main(String[] args) {
        boolean result = isNumber(3);
        System.out.println(result?"偶数":"奇数");
    }
}
