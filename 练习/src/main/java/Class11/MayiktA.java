package Class11;

public class MayiktA {//外部类
private static int code=200;
private static void show(){
    System.out.println("");
}
    public static class MayiktB{//局部内部类
public void mayiktB(){
    System.out.println("我是静态内部类中的mayikt方法");
    System.out.println(code);
}


    }

    public static void main(String[] args) {
        MayiktB mayiktB=new MayiktB();
    }
}
