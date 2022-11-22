package Class08;

public class Test01 {
    public static void main(String[] args) {
        Animal dog=new DogImpl();
        System.out.println(dog.code1);
        System.out.println(dog.code2);
        System.out.println(dog.code3);
        System.out.println("---------");
        System.out.println(Animal.code1);
        System.out.println(Animal.code2);
        System.out.println(Animal.code3);
    }


}
