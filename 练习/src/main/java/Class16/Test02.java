package Class16;

public class Test02 {
    public static void main(String[] args) {
        //java 编译阶段 创建一个子类(没有任何名称) 继承MayiktC抽象类
        MayiktC mayiktC = new MayiktC(){

            public void mayiktC() {
                System.out.println("我们使用匿名内部类 调用抽象方法mayiktC");
            }
        };
    }
}
