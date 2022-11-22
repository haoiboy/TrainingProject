package Class07;

public class CatImpl implements Animal{
    //CatImpl----实现类 实现了Animal接口

    /**
     * 实现类必须要重写接口中的所有方法
     */
    public void eat() {
        System.out.println("我是猫类 我喜欢吃鱼");
    }

}
