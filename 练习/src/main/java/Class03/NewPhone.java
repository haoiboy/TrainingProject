package Class03;

public class NewPhone extends Phone{
    /**
     * 什么是方法重写
     * 在父类中定义的方法，在我们子类中实现了重写
     * 父类和子类出现了一样的方法声明
     * 延续父类的功能 实现扩展
     * @param name
     */
    public  void  call(String name){

        System.out.println("我是子类中的call方法，我们新的手机可以支持视频通话");
        super.call(name);
    }
}
