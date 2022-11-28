package Class18;

import Class17.Mayikt;

public class Test06 {
    public static void main(String[] args) {

Student s1=new Student("张三",22);
Student s2=new Student("张三",22);
//比较成员属性值
        String str1="赵四";
        String str2="张三";
        System.out.println(s1.equals(s2));
        System.out.println(str1.equals(str2));

    }
}
