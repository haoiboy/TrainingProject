package Class05;

public class StudnetDemo {
    public static void main(String[] args) {
        //使用final修饰局部变量
        final int age=60;
      /// age=70;
        //使用final修饰的局部变量是基本数据类型 该局部变量基本类型数据的值不能被修改
       final Student student= new Student();//引用类型
        student.age=60;
      //  student=null;
        //使用final修饰局部变量，是一个引用类型，引用类型的地址，不能被修改的，但是
        //引用类型的地址里边的属性值是可以修改的
    }
    }

