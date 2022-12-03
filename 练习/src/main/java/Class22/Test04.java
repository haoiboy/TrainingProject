package Class22;

import java.text.ParseException;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        String s1 = DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(s1);
        Date date = DateUtils.stringToDate(s1, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);

        /**
         * 获取日期 年份
         * 获取日期 小时 分钟 秒
         */


        String s2 = DateUtils.dateToString(new Date(), "yyyy");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(new Date(), "HH:mm:ss");
        System.out.println(s3);
    }
}
