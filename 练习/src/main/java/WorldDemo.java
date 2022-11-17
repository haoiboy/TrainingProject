public class WorldDemo {
    public static void main(String[] args) {
        //new 执行到 构造方法 构造方法中做一些初始化操作
        World w1=new World();//无参构造
        System.out.println("w1:"+ w1.show());

         World w2  =new World("张三");//有参构造
         System.out.println("w2:"+ w2.show());

        World w3=new World("赵四",21);//有参
        System.out.println("w3:"+ w3.show());

        World w4 =new World(21);//有参
        System.out.println("w4:"+ w4.show());


    }
}
