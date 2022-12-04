package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Student> students= new  ArrayList<Student>();
        for (int i=1;i<=5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第"+i+"个学生的名称");
            String username=sc.nextLine();
            System.out.println("请输入第"+i+"个学生的年龄");
            int age=sc.nextInt();
            Student student=new Student(username,age);
            students.add(student);
            System.out.println("-------------");
        }
        System.out.println("五个对象存入成功");
        for(int i=0;i<students.size();i++){
            Student student=students.get(i);
            System.out.println("学生的名称："+student.getUserName()+
                    "  学生年龄："+student.getAge());
        }
    }
}
