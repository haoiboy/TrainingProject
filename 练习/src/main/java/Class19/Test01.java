package Class19;

public class Test01 {
    public static void main(String[] args) {
        AnimalParent cat = new Cat();
        //对象的引用 instanceof 具体的类型（类或者是接口）
        //cat instanceof  Dog 返回布尔类型 是该类型 则返回true 否则返回false
        if(cat instanceof Dog){
            System.out.println("猫 是我们的狗类型");
        }else {
            System.out.println("猫 不是我们的狗类型");
        }
        //
    }
}
