package Class06;

public class Test02 {
    public static void main(String[] args) {
        //父类引用子类对象
        //传递的参数1姓名2编号3薪水4奖金
        Employee employee=new Manager("张三",1,20000.00,2000.00);
        employee.work();
        System.out.println("员工的姓名:"+employee.getName());
        System.out.println("员工的工号:"+employee.getNumber());
        System.out.println("员工的薪水:"+employee.getSalary());
        Manager manager=(Manager)employee;
        System.out.println("项目经理的奖金："+manager.getBonus());
       // System.out.println("员工的奖金:"+employee.bonus);
        System.out.println("---------");
        Headman headman=new Headman("小微",2,30000.00);
        headman.work();
        System.out.println("员工的姓名:"+headman.getName());
        System.out.println("员工的工号:"+headman.getNumber());
        System.out.println("员工的薪水:"+headman.getSalary());
    }
}
