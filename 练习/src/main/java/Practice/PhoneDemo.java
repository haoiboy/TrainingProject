package Practice;

public class PhoneDemo {
    public static void main(String[] args) {
        //手机测试类
        //1.先创建对象 类名 对象名 = new 类名()
        Phone phone1=new Phone();
        //phone1 局部变量 对象名称（成员属性和成员方法）
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        System.out.println("--------------");
        phone1.brand="小米";
        phone1.price=2999;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        phone1.call(phone1.brand);
        Phone phone2=new Phone();
        phone2.brand="华为";
        phone2.price=3999;
        phone1.call(phone2.brand);
    }
}
