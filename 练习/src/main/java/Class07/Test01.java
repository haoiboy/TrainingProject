package Class07;

public class Test01 {
    public static void main(String[] args) {
        /**接口不能实例化
         * 多态机制
         */
        Animal animal=new CatImpl();
        animal.eat();
    }
}
