package Class06;

public class Manager extends Employee{
    private double bonus;


    public Manager(String name, int number, double salary,Double bonus) {
        super(name, number, salary);
        this.bonus=bonus;
    }

    public void work() {
        System.out.println("我是项目经理 我负责管理整个项目...");
    }

    public double getBonus() {
        return bonus;
    }
}
