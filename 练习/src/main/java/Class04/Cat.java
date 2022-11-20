package Class04;

public class Cat extends AnimalParent{
    public Cat(String name,int age){
        super(name, age);

    }
    public Cat(){

    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
