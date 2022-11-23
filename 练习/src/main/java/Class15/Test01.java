package Class15;

public class Test01 {
    public static void main(String[] args) {
        AnimalParent dog=new   AnimalParent(){

            public void eat() {
                System.out.println("我是狗类，我喜欢吃骨头");
            }
        };
        dog.eat();
        AnimalParent cat=new   AnimalParent(){

            public void eat() {
                System.out.println("我是猫类，我喜欢吃鱼");
            }
        };
        cat.eat();
        AnimalParent man=new   AnimalParent(){

            public void eat() {
                System.out.println("我是人类，我喜欢吃米饭");
            }
        };
        man.eat();
    }

}
