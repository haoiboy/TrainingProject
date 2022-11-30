package Class21;

public class Test04 {
    public static void main(String[] args) {
        //将String类型装转换成int类型
        String str="123";
        Integer integerA = Integer.valueOf(str);
        //intValue方法不是静态方法 ，需要先new对象，对象实例.intvalue
        int i=integerA.intValue();
        System.out.println(i);
        System.out.println(integerA);
        System.out.println("-------");
        //企业开发中常用Integer.parseInt()
        int parseInt = Integer.parseInt(str);
        System.out.println(parseInt);
    }
}
