package Class02;

public class Student extends Parent{
    /**
     * 构造方法----给对象属性初值
     * new 执行 构造方法
     */
    public Student(){
        super(20);//访问父类中的无参构造方法
        System.out.println("学生类的无参方法");
    }
    public Student(int age){
        super(20);//访问父类中的无参构造方法
        System.out.println("学生类的有参方法");
    }
}
