package Class22;

import java.util.Calendar;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        Calendar c=Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));
    }
}
