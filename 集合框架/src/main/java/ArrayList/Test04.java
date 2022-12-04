package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {
    //学生管理系统
    private static ArrayList<Student> stus= new ArrayList<Student>();
private volatile static boolean isRun=true;//volatile 保证isRun 线程可见性
    public static void main(String[] args) {
//        while (isRun){
while (true){

        //1.主界面
        System.out.println("欢迎您来到学生管理系统");
        System.out.println("1.新增学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出系统");
        System.out.println("请输入[1-5]");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch (number){
            case 1:
                System.out.println("新增学生");
                addStudent();
                break;
            case 2:
                System.out.println("删除学生");
                deleteStudent();
                break;
            case 3:
                System.out.println("修改学生");
               updateStudent();
                break;
            case 4:
                System.out.println("查询学生");
                showStudent();
                break;
            case 5:
//                isRun=false;
                System.exit(0);//停止jvm进程
                System.out.println("系统退出");
//                return;

        }

    }
}
public static void addStudent(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入学生的学号：");
    String stuId = scanner.nextLine();
    Student student=getByStuIdStudent(stuId);
    if (student !=null){
        System.out.println("该学号已经被"+student.getUserName()+"使用,不能插入相同的学号");
        return;
    }
    System.out.println("请输入学生的名称：");
    String name = scanner.nextLine();
    System.out.println("请输入学生的地址：");
    String address = scanner.nextLine();
    System.out.println("请输入学生的年龄：");
    Integer age = scanner.nextInt();
    //将学生的信息存入到集合中
    stus.add(new Student(stuId,name,age,address));
    System.out.println("新增完成");
}

    /** 封装提供方法 根据学号查询 学生对象集合中 学生信息
     * 如果能够查询到 则直接返回
     *
     *
     */

    private static Student getByStuIdStudent(String stuId) {
        return getByStuIdStudent(stuId,false);
    }

    public static Student getByStuIdStudent(String stuId,boolean isDelete) {
    for (int i = 0; i < stus.size(); i++) {
        Student student = stus.get(i);
        if (student.getStuId().equals(stuId)) {
            if(isDelete){
                //根据学号查询到该学生 如果isDelete=true 则会在集合中删除该学生
                return stus.remove(i);//如果删除成功就会返回原来删除的对象
            }
            return student;
        }
    }
return null;
}
//查询学生
public static void showStudent(){
        if (stus.size()==0){
            System.out.println("该集合中没有存入任何对象");
            return;
        }
    System.out.println("学号\t姓名\t地址\t年龄\t");
for (int i=0;i<=stus.size();i++){
    Student student = stus.get(i);
    System.out.println(student.getStuId()+  "\t"+student.getUserName()
              +  "\t"+student.getAddress()+  "\t"+student.getAge());
}
}
//删除学生的方法
public static  void deleteStudent(){
    System.out.println("请输入需要删除的学生学号：");
        Scanner scanner=new Scanner(System.in);
    String stuId = scanner.nextLine();
    Student student=getByStuIdStudent(stuId,true);
    if (student==null){
        System.out.println("没有根据该学号查询到删除的学生");
        return;
    }
    System.out.println("删除学生的学号"+stuId+"成功");
//    for (int i=0;i<stus.size();i++){
////        Student student=stus.get(i);
////       if (student.getStuId().equals(stuId)){
////           stus.remove(i);
////           System.out.println("删除学生的学号"+stuId+"成功");
////           return;//如果根据学号查到该学生 该循环就停止
////       }

//    }


}
//修改学生信息
public static void updateStudent(){
    System.out.println("请输入需要修改的学生学号：");
    Scanner scanner=new Scanner(System.in);
    String stuId = scanner.nextLine();
    Student student=getByStuIdStudent(stuId);
    if (student==null){
        System.out.println("根据该学号没有查找到需要修改的学生对象");
        return;
    }
    System.out.println("请输入需要修改新的姓名：");
    String newName=scanner.nextLine();
    System.out.println("请输入需要修改的新的地址：");
    String newadress=scanner.nextLine();
    System.out.println("请输入需要修改的新的年龄");
    Integer newage=scanner.nextInt();
    student.setUserName(newName);
    student.setAddress(newadress);
    student.setAge(newage);
    System.out.println("修改成功");

}
}
