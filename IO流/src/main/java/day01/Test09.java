package day01;

public class Test09 {
    public static void main(String[] args) {
      a();
    }
    private static int count=0;
    public static void a(){
        System.out.println("栈空间深度:"+(++count));
        a();
    }
}
