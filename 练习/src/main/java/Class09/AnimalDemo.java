package Class09;

public class AnimalDemo {
    public static void main(String[] args) {
      JumpInterface cat1  =new Cat("小白猫",2);

      cat1.jump();
        System.out.println("---------");
      Animal cat2=new Cat("小花猫",1);
        System.out.println(cat2.getName()+","+cat2.getAge());
      cat2.jump();
      cat2.eat();
        System.out.println("----------");
      Animal dog=new Dog("小黑狗",2);
      dog.setName("小黑狗");
      dog.setAge(2);
        System.out.println(dog.getName()+","+dog.getAge());
      dog.eat();
      dog.jump();

    }
}
