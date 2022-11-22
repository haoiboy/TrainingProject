package Class05;

public class AnimalDemo01 {

    public static void main(String[] args) {
         //1动物操作类
        AnimalOperate animalOperate=new AnimalOperate();
//        //2调用猫类中的eat
//        animalOperate.userCatEat(new Cat());
//        //3调用狗类中的eat
//        animalOperate.userDogEat(new Dog01());

        animalOperate.userAnimal(new Dog01());
        animalOperate.userAnimal(new Cat());
    }
}
