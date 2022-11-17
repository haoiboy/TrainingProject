public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="张三";
        student1.age=18;
        System.out.println(student1.name+"    -     "+student1.age);
        student1.work();
        Student student2 = new Student();
        student2.name="赵四";
        student2.age=20;
        student2.work();
        System.out.println(student2.name+"    -     "+student2.age);
    }
}
