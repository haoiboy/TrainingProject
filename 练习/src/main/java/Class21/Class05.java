package Class21;

public class Class05 {
    public static void main(String[] args) {
/**
 * long与string类型互转
 */
String str="123456789";
        Long aLong = Long.valueOf(str);
        long l1=aLong.longValue();
        System.out.println(l1);
        System.out.println("-------");
        long l2=Long.parseLong(str);
        System.out.println(l2);
    }
}
