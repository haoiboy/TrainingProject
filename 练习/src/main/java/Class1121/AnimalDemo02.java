package Class1121;

public class AnimalDemo02 {
    public static void main(String[] args) {
        //调用成员方法，编译看左边
        Dog01 dog01=new Dog01();
        System.out.println(
                "直接通过 Dog类型接收"
        );
        dog01.showDog();
        //多态中，编译阶段看左边，执行看右边，向上转型，从子到父
        AnimalParent01 parent01=new Dog01();
        parent01.eat();
        //访问我们parent对象中 showDog() 向下转型 将父转换成子
        System.out.println("直接 向下转型");
        //将父转换成子
        Dog01 dog02=(Dog01)parent01;
        dog02.showDog();
        Cat cat=(Cat)parent01;

    }
}
