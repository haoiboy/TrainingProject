package Class22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Class03 {
    public static void main(String[] args) {
        Date date1=new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat
                ("yyyy年MM月dd日HH时mm分ss秒");
        String strDate=simpleDateFormat.format(date1);
        System.out.println("格式化后的日期："+strDate);
        long time=1000*60*60;
        //1970 1月1日 08:00:00 时间差8 +1小时
        date1.setTime(time);
        System.out.println(date1);
        Date date2=new Date(0);
        System.out.println(date2);
    }
}
