package Class16;

public class Test01 {
    public static void main(String[] args) {
        //new MayiktA接口 底层实际上 帮助我们创建了实现类 实现了MayiktA接口
/**
 * 接口和抽象类 是不能够被实例化
 * 匿名内部类底层 new  接口 底层还是帮你创建了 实现类 名称是null----编译阶段实现
 */

        MayiktA mayiktA=new MayiktA(){
            public void mayiktA(){
                System.out.println("我是mayiktA方法，匿名 内部类");
            }
        };
        mayiktA.mayiktA();
    }
}
