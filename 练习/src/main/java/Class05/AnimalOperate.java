package Class05;

public class AnimalOperate {
    public void userCatEat(Cat cat){
        cat.eat();
    }
    public void userDogEat(Dog01 dog01){
        dog01.eat();
    }
    public void userAnimal(AnimalParent01 animalParent01){
        animalParent01.eat();

    }

    public void userAnimal() {
        AnimalParent01 cat=new Cat();
        cat.eat();
        AnimalParent01 dog=new Dog01();
        dog.eat();
    }

}
