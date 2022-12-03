package Class22;

import java.util.Calendar;

public class Test05 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//多态机制
        //修改年月日
        c.add(Calendar.YEAR,-24);
        c.add(Calendar.MONTH,-24);
        c.add(Calendar.DATE,-24);
        System.out.println(c);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int date=c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+date+"日");

    }
}
