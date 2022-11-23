package Class13;

public class Test01 {
    public static void main(String[] args) {
        //匿名内部类
        MayiktB mayiktB= new MayiktB(){
//重写了接口中的方法
             public void MayiktB() {
                 System.out.println("我是匿名内部类中的MayiktB方法 ");
             }
         };
         mayiktB.MayiktB();
         //底层实际上是创建了子类
         MayiktC mayiktC=new MayiktC() {
             public void mayiktC() {
                 System.out.println("我是匿名内部类中的MayiktC方法");
             }
         };
    }
    /**
     *使用匿名内部类，就不需要创建我们的 实现类和子类
     * 直接通过 new 内部类的形式 简化不需要创建 实现类和子类
     *使用匿名内部类，是不需要创建实现类
     */
}
