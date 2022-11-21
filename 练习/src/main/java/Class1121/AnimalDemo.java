package Class1121;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        //有父类指向子类对象
        AnimalParent animalParent=new Dog();
        animalParent.eat();
        Dog dog=new Dog();
        dog.eat();
        System.out.println(dog.age);
        System.out.println(dog.weight);
        dog.show();
    }
}
