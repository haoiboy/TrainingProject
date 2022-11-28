package Class18;

public class Class03 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",22);
        Student s2 = new Student("张三",22);
        //比较两个两个对象的内存地址是否相等
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
