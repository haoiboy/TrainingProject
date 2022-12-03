package Class22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;

public class DateUtils {
    private  static     final String FORMAT_1="yyyy-MM-dd HH:mm:ss";
    private DateUtils(){

    }
    //获取到当前系统时间 直接转化String类型
    public static String getCuDateString(){
return dateToString(new Date(),FORMAT_1);
    }
    //date转化成字符串
    public static String dateToString(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    //字符串转化成date
    public  static Date stringToDate(String date,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }
}
