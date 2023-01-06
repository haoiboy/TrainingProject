package day01;

public interface JDK8Interface {
    void addOrder();
    /**
     * 默认方法
     * 可以写方法体
     */
    default void getDefaultOrder() {
        System.out.println("我是默认方法，可以写方法体");
    }
    static void getStaticOrder(){
        System.out.println("我是静态的方法，可以写方法体");
    }
}
