package Class06;

public abstract class AnimalParent {
    /**1.eat没有方法体 具体都是由子类重写的
     * 如果在方法上加上abstract进行修饰，为抽象方法
     * 如果在一个类中存在一个抽象方法，则该类必须是抽象类
     * 2.在一个抽象类中是可以存在抽象方法的
     * 3.在抽象类 可以定义 非抽象方法
     * 4.子类必须要重写父类中所有的抽象方法，非抽象方法不强制重写
     * 5.如果子类没有重写父类的抽象方法，则该子类也需要是抽象类，就可以继承父类中的抽象方法
     * 6.抽象类不能实例化
     * 7.抽象类可以有构造方法，用于子类访问父类时的数据初始化
     */
private int age;
private final int code=200;//常量

    /**
     * 抽象类是可以有构造函数
     * 函数--方法
     * 构造方法--构造函数
     */
    /**
     * 定义好的无参构造方法
     */
    public AnimalParent(){
        System.out.println("AnimalParent我是无参构造方法...");
    }

    /**
     * 抽象类中可以定义有参构造方法，子类访问父类初始化时，可以给我们的父类的成员属性进行赋值
     * @param age
     */

    public AnimalParent(int age) {
        this.age = age;
        System.out.println("AnimalParent我是有参构造方法");
    }

    //抽象方法
    public abstract void eat();
    public abstract void show();
//非抽象方法
    public void get(){
        age=300;

        System.out.println(age);
        System.out.println(code);
    }

}
