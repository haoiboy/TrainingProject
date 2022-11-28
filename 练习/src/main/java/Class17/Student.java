package Class17;

public class Student extends Parent{
    /**
     * 如果我们的类没有继承其他类的情况下，则当前该类 默认间接的继承了Object类
     * 1.在Object类中有一个无参构造方法
     * 2.clone（）复制对象
     * 3.equals(Object obj) 比较两个对象是否相等
     * 3.finalize()---jvm的垃圾回收机制
     * 4.getClass()--获取该对象的Class
     * 5.hashCode()--HashMap集合
     * 6.notify(),notifyAll(),wait(),wait(long timeoutMillis)
     * 7.toString---返回对象的字符串表示形式
     * 多线程 synchronized 多线程之间的通讯
     * 直接继承和间接继承
     */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){
        super();//默认父类中无参构造方法
    }
}
