package Class22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        String strDate="2022-12-02 16:14:09";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat
                ("yyyy-MM-dd HH:mm:ss");
        //将String字符串类型转换成Date类型
        Date date=  simpleDateFormat.parse(strDate);
        System.out.println(date);
    }
}
