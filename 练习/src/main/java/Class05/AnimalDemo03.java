package Class05;

public class AnimalDemo03 {
    public static void main(String[] args) {
        //向上转型
        AnimalParent01 animalParent01=new Dog01();
        //向下转型(父强转成子)
        Dog01 dog01=(Dog01)animalParent01;
        //将dog对象强转成猫类--程序运行报错
        Cat cat= (Cat)animalParent01;

    }
}
