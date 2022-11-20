package Practice;

public class Class10 {
    public static void main(String[] args) {
        int number=10;
        System.out.println("main主方法中调用方法前（实参）:"+number);
        change(number);
        System.out.println("main主方法中调用方法后（实参）:"+number);
    }

    private static void change(int number) {
        System.out.println("change中number改变前（形参）："+number);
        number=20;
        System.out.println("change中number改变后（形参）："+number);
    }
}
