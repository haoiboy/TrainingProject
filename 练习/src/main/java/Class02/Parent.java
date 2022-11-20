package Class02;

public class Parent {
    public Parent(){
        System.out.println("父类中的无参构造方法");
    }
    public Parent(int age){
        System.out.println("父类中的有参构造方法");
    }
    /**
     * 本身一个类就有一个默认的无参构造方法
     */
}
