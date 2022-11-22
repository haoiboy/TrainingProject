package Class06;

public class Headman extends Employee{
    public Headman(String name, int number, double salary) {
        super(name, number, salary);
    }

    public void work() {
        System.out.println("我是项目组长负责带领小的团队 编码工作");
    }
}
