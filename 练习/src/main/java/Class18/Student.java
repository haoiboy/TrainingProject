package Class18;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//通过有参构造方法给成员属性赋值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写父类中的equals方法
    public boolean equals(Object object) {
        //如果两个对象的引用内存地址相同 则直接返回true
        if (this == object) {
            return true;
        }
        //比较对象的类型
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        Student s2=(Student)object;
        return this.age== s2.age&&this.name.equals(s2.name);
    }
}
