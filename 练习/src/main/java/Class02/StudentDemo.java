package Class02;

public class StudentDemo {
    /**
     * 子类中所有的构造方法，都会默认访问父类中的无参构造方法
     * @param args
     */
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student(20);
    }

}
