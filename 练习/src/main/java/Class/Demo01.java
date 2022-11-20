package Class;

public class Demo01 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setUsername("张三");
        s.setAge(21);
        System.out.println(s.getUsername()+","+ s.getAge());
        s.workStudent();
        Teacher t=new Teacher();
        t.setUsername("赵四");
        t.setAge(22);
        System.out.println(t.getUsername()+","+t.getAge());
         t.workTeacher();
    }

}
