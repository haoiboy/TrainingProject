package Class1121;

public final class Parent {
    private final int age=22;//成员属性变量 不用写初始化值 默认值时0
    /**
     * final关键字修饰我们的 类，成员属性，成员方法
     * 1.被final关键字修饰的类 无法被继承
     * 2.被final关键字修饰成员方法 无法被重写
     * 3.被final修饰的成员属性 该变量的值无法被修改
     */
    public void a1(){
//this.age=26;
    }
}
