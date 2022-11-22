package Class05;

public class Dog extends AnimalParent{
public  int age=20;
    public  int weight=40;
    /**
     * Dog(子类)
     * 多态的基本条件
     * 1、有继承/实现关系
     * 2.方法重写
     * 3.有父类引用指向子类对象
     */
    public void eat(){
        System.out.println("子类（狗类）重写父类 吃方法");
    }
    public  void show(){

    }
}
