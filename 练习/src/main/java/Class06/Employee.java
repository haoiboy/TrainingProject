package Class06;

/**
 * 员工类
 */
public abstract class Employee { //员工抽象类

    private String name;//姓名
private int number;//工号
private double salary;//工资

    public Employee(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 不同的员工 工作内容不同 是不一样的work抽象方法
     * 需要交给不同的子类进行重写
     */
    public abstract void work();
}
