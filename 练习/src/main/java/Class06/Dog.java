package Class06;

public class Dog extends AnimalParent{
    /**
     * 默认每个类中有一个无参构造方法 ，默认是不用写的
     */
    public Dog(int age){
        super(age);
        System.out.println("我是狗类中的有参构造方法");
    }
    public void eat() {
        System.out.println("我是狗类，我喜欢吃骨头");
    }

    public void show() {

    }
}
