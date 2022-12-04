package ArrayList;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
         //1.创建对象
        Student s1=new Student("小微",22);
        Student s2=new Student("小王",22);
        Student s3=new Student("小曹",22);
        Student s4=new Student("小山",22);
        Student s5=new Student("小睿",22);
        //2.学生集合
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println("存入五个对象成功");
        System.out.println("开始遍历集合中学生对象");
        //3.遍历集合中的数据
        for (int i=0;i<students.size();i++){
            Student student = students.get(i);
            System.out.println("学生的名称："+student.getUserName()+
                    "  学生年龄："+student.getAge() );

//            System.out.println(students.get(i));
        }

    }
}
