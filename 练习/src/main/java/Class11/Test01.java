package Class11;

public class Test01 {
    public static void main(String[] args) {
//        MayiktA.MayiktB mayiktB= new  MayiktA().new MayiktB();
//        mayiktB.mayiktB();
        //外界访问 静态内部类 new 外部类.内部类();
        MayiktA.MayiktB mayiktB= new  MayiktA.MayiktB();
        mayiktB.mayiktB();
    }
}
