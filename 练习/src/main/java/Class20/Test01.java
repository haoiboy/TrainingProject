package Class20;

public class Test01 {
    public static void main(String[] args) {
       AnimalParent animalParent= new Cat();
       if(animalParent instanceof DogImpl){
           System.out.println("animalParent是为DogImpl类型，直接强转");
           DogImpl dogImpl=(DogImpl)animalParent;
           System.out.println("dogImpl"+dogImpl);
       }else {
           System.out.println("animalParent不是为DogImpl类型，不直接强转");
       }
    }
}
