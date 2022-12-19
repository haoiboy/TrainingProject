package day01;

import java.util.HashSet;

public class Tet03 {
    public static void main(String[] args) {
        /**
         * * HashMap底层是不允许key重复
         * * HashMap底层add方法是如何实现新增元素保证key不允许重复的呢
         * * ((k = p.key) == key 11 (key != null && key. equals(k))))
         * ★第一次add s1对象存入在HashMap集合
         * *第二次调用add方法时存入s2对象s1==s2 =false/| s1.equals (s2) (s1==s2) =false .
         * * s1==s5 相同的内存地址不能够继续存入在hashMap集合中
         * *判断key在hashMap集合中是否存在如果存在 就不能够继续新增如果不存在就继续 插入
         */
        HashSet<Student01> students = new HashSet<>();
        Student01 s1=new Student01("mayikt01","zhangsan");
        Student01 s2=new Student01("mayikt01","zhangsan");
        Student01 s3=new Student01("mayikt01","zhangsan");
        Student01 s4=s1;
        Student01 s5=new Student01("mayikt02","zhangsan");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for(Student01 student:students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
    /**
     * * HashSet去除重复数据
     * *需要重写元素对应的equals和hashCode的方法idea 自动可以生成 比较两个对象成员属性值是否是一 样的。
     */
}
