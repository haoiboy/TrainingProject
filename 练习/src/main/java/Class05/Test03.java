package Class05;

public class Test03 {
    //
    //staticAge  静态成员属性
    private  static int staticAge=30;
    private   int age=30;
    public static void main(String[] args) {
        Test03.staticA();
        TestDemo01.staticAss();
        System.out.println(staticAge);
        Test03 t2 = new Test03();
        System.out.println(t2.age);

        //main方法中调用静态成员方法，静态属性
        staticA();
        /**
         * 静态方法中不能直接调用非静态方法
         */
        Test03 t1 = new Test03();
        t1.A();
        //         A();
    }
    //静态方法
    public  static void staticA(){

    }
    public  void A(){

    }
}
