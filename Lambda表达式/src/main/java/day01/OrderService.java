package day01;

@FunctionalInterface
public interface OrderService {
//    void get();
    /**
     *如果需要使用到orderService接口
     *接口是无法new、 可以通过匿名内部类new
     *定义子类
     */

    /**
     * object父类中的方法 可以在函数接口中重写
     * @return
     */
    String toString();
  String  get(int i,int j);


}
